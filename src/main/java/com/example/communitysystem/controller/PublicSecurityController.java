package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Disabled;
import com.example.communitysystem.entity.PublicSecurity;
import com.example.communitysystem.service.PublicSecurityService;
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
//治安记录
@RestController
public class PublicSecurityController {

    @Autowired
    private PublicSecurityService publicSecurityService;

    @PostMapping("/insertPublicSecurity")
    public ResponseData<Integer> insertPublicSecurity(PublicSecurity publicSecurity){
        return new ResponseData("0",publicSecurityService.insert(publicSecurity));
    }

    @GetMapping("/getAllPublicSecurity")
    public ResponseData<List<PublicSecurity>> getAllPublicSecurity(){
        return new ResponseData("0",publicSecurityService.selectAll());
    }

    @GetMapping("/getPublicSecurityById")
    public ResponseData<List<PublicSecurity>> getPublicSecurityById(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String id){
        return new ResponseData("0",publicSecurityService.selectById(id));
    }

    @PostMapping("/deletePublicSecurityById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData("0",publicSecurityService.deleteById(id));
    }

    @PostMapping("/deletePublicSecurityByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        return new ResponseData("0",publicSecurityService.deleteByIds(ids));
    }

    @PostMapping("/updatePublicSecurity")
    public ResponseData<Integer> updateDisabled(PublicSecurity publicSecurity){
        return new ResponseData("0",publicSecurityService.update(publicSecurity));
    }

}
