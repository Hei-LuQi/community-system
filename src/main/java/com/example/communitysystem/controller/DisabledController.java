package com.example.communitysystem.controller;

import com.example.communitysystem.entity.Disabled;
import com.example.communitysystem.service.DisabledService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//残疾人管理
@RestController
public class DisabledController {

    @Autowired
    private DisabledService disabledService;


    @PostMapping("/insertDisabled")
    public ResponseData insertDisabled(Disabled disabled){
        return new ResponseData("0",disabledService.insert(disabled));
    }

    @GetMapping("/getAllDisabled")
    public ResponseData<List<Disabled>> getAllDisabled(){
        return new ResponseData("0",disabledService.selectAll());
    }

    @GetMapping("/getDisabledByName")
    public ResponseData<List<Disabled>> getDisabledByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData("0",disabledService.selectByName(name));
    }

    @PostMapping("/deleteDisabledById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData("0",disabledService.deleteById(id));
    }

    @PostMapping("/deleteDisabledByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        return new ResponseData("0",disabledService.deleteByIds(ids));
    }

    @PostMapping("/updateDisabled")
    public ResponseData<Integer> updateDisabled(Disabled disabled){
        return new ResponseData("0",disabledService.update(disabled));
    }

}
