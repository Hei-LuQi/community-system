package com.example.communitysystem.controller;


import com.example.communitysystem.entity.School;
import com.example.communitysystem.service.SchoolService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
///社区市民学校表
@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/insertSchool")
    public ResponseData<Integer> insertSchool(School school){
        return new ResponseData("0",schoolService.insert(school));
    }

    @GetMapping("/getAllSchool")
    public ResponseData<List<School>> getAllSchool(){
        return new ResponseData("0",schoolService.selectAll());
    }

    @GetMapping("/getSchoolByName")
    public ResponseData<List<School>> getSchoolByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData("0",schoolService.selectByName(name));
    }

    @PostMapping("/deleteSchoolById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData("0",schoolService.deleteById(id));
    }

    @PostMapping("/deleteSchoolByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        return new ResponseData("0",schoolService.deleteByIds(ids));
    }

    @PostMapping("/updateSchool")
    public ResponseData<Integer> updateSchool(School school){
        return new ResponseData("0",schoolService.update(school));
    }

}
