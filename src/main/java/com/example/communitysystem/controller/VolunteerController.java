package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Volunteer;
import com.example.communitysystem.service.VolunteerService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
public class VolunteerController {
//志愿者表
    @Autowired
    private VolunteerService volunteerService;

    @PostMapping("/insertVolunteer")
    public ResponseData<Integer> insertVolunteer(Volunteer volunteer){
        return new ResponseData<Integer>("0",volunteerService.insert(volunteer));
    }

    @GetMapping("/getAllVolunteer")
    public ResponseData<List<Volunteer>> getAllVolunteer(){
        return new ResponseData<List<Volunteer>>("0",volunteerService.selectAll());
    }

    @GetMapping("/getVolunteerByName")
    public ResponseData<List<Volunteer>> getVolunteerByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData<List<Volunteer>>("0",volunteerService.selectByName(name));
    }

    @PostMapping("/deleteVolunteerById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData<Integer>("0",volunteerService.deleteById(id));
    }

    @PostMapping("/deleteVolunteerByIds")
    public ResponseData<Integer> deleteById(@RequestParam List<String> ids){
        return new ResponseData<Integer>("0",volunteerService.deleteByIds(ids));
    }

    @PostMapping("/updateVolunteer")
    public ResponseData<Integer> updateVolunteer(Volunteer volunteer){
        return new ResponseData<Integer>("0",volunteerService.update(volunteer));
    }

}
