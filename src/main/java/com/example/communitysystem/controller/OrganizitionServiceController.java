package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Institution;
import com.example.communitysystem.entity.OrganizationService;
import com.example.communitysystem.service.OrganizationServiceService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
//群众服务组织管理
@RestController
public class OrganizitionServiceController {

    @Autowired
    private OrganizationServiceService organizationServiceService;

    @PostMapping("/insertOrganizationService")
    public ResponseData<Integer> insertOrganizationService(OrganizationService organizationService){
        return new ResponseData<Integer>("0",organizationServiceService.insert(organizationService));
    }

    @GetMapping("/getAllOrganizationService")
    public ResponseData<List<OrganizationService>> getAllOrganizationService(){
       return new ResponseData("0",organizationServiceService.selectAll());
    }

    @GetMapping("/getOrganizationServiceByLeader")
    public ResponseData<List<OrganizationService>> getOrganizationServiceByLeader(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String leader){
        return new ResponseData("0",organizationServiceService.selectByLeader(leader));
    }

    @PostMapping("/updateOrganizationService")
    public ResponseData<List<Institution>> updateOrganizationService(OrganizationService organizationService){
        return new ResponseData("0",organizationServiceService.update(organizationService));
    }

    @PostMapping("/deleteOrganizationServiceById")
    public ResponseData<Integer> deleteOrganizationServiceById(@RequestParam String id){
        return new ResponseData("0",organizationServiceService.deleteById(id));
    }

    @PostMapping("/deleteOrganizationServiceByIds")
    public ResponseData<Integer> deleteOrganizationServiceByIds(@RequestParam List<String> ids){
        return new ResponseData("0",organizationServiceService.deleteByIds(ids));
    }

}
