package com.example.communitysystem.controller;


import com.example.communitysystem.entity.LowIncomeFamily;
import com.example.communitysystem.service.LowIncomeFamilyService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//低保户管理
@RestController
public class LowIncomeFamilyController {

    @Autowired
    private LowIncomeFamilyService lowIncomeFamilyService;

    @PostMapping("/insertLowIncomeFamily")
    public ResponseData<Integer> insertLowIncomeFamily(LowIncomeFamily lowIncomeFamily){
        return new ResponseData("0",lowIncomeFamilyService.insert(lowIncomeFamily));
    }

    @GetMapping("/getAllLowIncomeFamily")
    public ResponseData<List<LowIncomeFamily>> getAllLowIncomeFamily(){
        return new ResponseData("0",lowIncomeFamilyService.selectAll());
    }

    @GetMapping("/getLowIncomeFamilyByName")
    public ResponseData<List<LowIncomeFamily>> getLowIncomeFamilyByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData("0",lowIncomeFamilyService.selectByName(name));
    }

    @PostMapping("/deleteLowIncomeFamilyById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData("0",lowIncomeFamilyService.deleteById(id));
    }

    @PostMapping("/deleteLowIncomeFamilyByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        return new ResponseData("0",lowIncomeFamilyService.deleteByIds(ids));
    }

    @PostMapping("/updateLowIncomeFamily")
    public ResponseData<Integer> updateLowIncomeFamily(LowIncomeFamily lowIncomeFamily){
        return new ResponseData("0",lowIncomeFamilyService.update(lowIncomeFamily));
    }

}
