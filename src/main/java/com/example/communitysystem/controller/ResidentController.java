package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Resident;
import com.example.communitysystem.service.ResidentService;
import com.example.communitysystem.util.ResponseData;
import com.example.communitysystem.util.UploadFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class ResidentController {
//居民表
    @Autowired
    private UploadFileUtil uploadFileUtil;

    @Autowired
    private ResidentService residentService;

    @PostMapping("/uploadResidentAvatar")
    public ResponseData<String> uploadResidentAvatar(HttpServletRequest request) {
        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multiRequest.getFile("files");
        String msg = uploadFileUtil.uploadFile(file);
        return new ResponseData<String>("0",msg);
    }

    @PostMapping("/insertResident")
    public ResponseData<Integer> insertResidentAvatar(Resident resident){
        resident.setCreateDate(new Date());
        return new ResponseData<Integer>("0",residentService.insert(resident));
    }

    @GetMapping("/getAllResident")
    public ResponseData<List<Resident>> getAllResident(){
        return new ResponseData<List<Resident>>("0",residentService.selectAll());
    }

    @GetMapping("/getResidentById")
    public ResponseData<List<Resident>> getResidentById(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String id){
        return new ResponseData<List<Resident>>("0",residentService.selectById(id));
    }

    @PostMapping("/deleteResidentById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData<Integer>("0",residentService.deleteById(id));
    }

    @PostMapping("/deleteResidentByIds")
    public ResponseData<Integer> deleteById(@RequestParam List<String> ids){
        return new ResponseData<Integer>("0",residentService.deleteByIds(ids));
    }

    @PostMapping("/updateResident")
    public ResponseData<Integer> updateResident(Resident resident){
        return new ResponseData<Integer>("0",residentService.update(resident));
    }

}
