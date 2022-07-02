package com.example.communitysystem.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.communitysystem.entity.Institution;
import com.example.communitysystem.service.InstitutionService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//社区机构管理
@RestController
public class InstitutionController {

    @Autowired
    InstitutionService institutionService;

    @GetMapping("/getAllInstitution")
    public ResponseData<List<Institution>> getAllInstitution(){
        return new ResponseData("0",institutionService.selectAll());
    }
    @PostMapping("/updateInstitution")
    public ResponseData<Integer> updateInstitution(Institution institution){
        return new ResponseData("0",institutionService.update(institution));
    }
    @GetMapping("/getInstitutionByName")
    public ResponseData<List<Institution>> getInstitutionByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData("0",institutionService.selectByName(name));
    }
    @PostMapping("/insertInstitution")
    public ResponseData<Integer> getInstitutionByName(Institution institution){
        return new ResponseData("0",institutionService.insert(institution));
    }
    @PostMapping("/deleteInstitutionById")
    public ResponseData<Integer> deleteInstitutionById(@RequestParam String id){
        return new ResponseData("0",institutionService.deleteInstitutionById(id));
    }
    @PostMapping("/deleteInstitutionByIds")
    public ResponseData<Integer> deleteInstitutionByIds(@RequestParam List<String> ids){
        return new ResponseData("0",institutionService.deleteInstitutionByIds(ids));
    }
}
