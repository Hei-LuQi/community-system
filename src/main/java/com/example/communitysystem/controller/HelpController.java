package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Help;
import com.example.communitysystem.entity.Institution;
import com.example.communitysystem.service.HelpService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
//救灾救济管理
@RestController
public class HelpController {

    @Autowired
    private HelpService helpService;

    @PostMapping("/insertHelp")
    public ResponseData<Integer> insertHelp(Help help){
        return new ResponseData("0",helpService.insert(help));
    }

    @GetMapping("/getAllHelp")
    public ResponseData<List<Help>> getAllHelp(){
        return new ResponseData("0",helpService.selectAll());
    }

    @GetMapping("/getHelpById")
    public ResponseData<List<Help>> getHelpById(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String id){
        return new ResponseData("0",helpService.selectById(id));
    }

    @PostMapping("/updateHelp")
    public ResponseData<Integer> updateHelp(Help help){
        return new ResponseData("0",helpService.update(help));
    }

    @PostMapping("/deleteHelpById")
    public ResponseData<Integer> deleteInstitutionById(@RequestParam String id){
        return new ResponseData("0",helpService.deleteById(id));
    }

    @PostMapping("/deleteHelpByIds")
    public ResponseData<Integer> deleteInstitutionByIds(@RequestParam List<String> ids){
        return new ResponseData("0",helpService.deleteByIds(ids));
    }

}
