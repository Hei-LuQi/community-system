package com.example.communitysystem.controller;


import com.example.communitysystem.entity.House;
import com.example.communitysystem.service.HouseService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
//出租屋管理
@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping("/insertHouse")
    public ResponseData<Integer> insertHouse(House house){
        return new ResponseData<Integer>("0",houseService.insert(house));
    }

    @GetMapping("/getAllHouse")
    public ResponseData<List<House>> getAllHouse(){
        return new ResponseData<List<House>>("0",houseService.selectAll());
    }

    @GetMapping("/getHouseByUserName")
    public ResponseData<List<House>> getHouseByUserName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String userName){
        return new ResponseData<List<House>>("0",houseService.selectByUserName(userName));
    }

    @PostMapping("/deleteHouseById")
    public ResponseData<Integer> deleteHouseById(@RequestParam String id){
        return new ResponseData<Integer>("0",houseService.deleteById(id));
    }

    @PostMapping("/deleteHouseByIds")
    public ResponseData<Integer> deleteHouseById(@RequestParam List<String> ids){
        return new ResponseData<Integer>("0",houseService.deleteByIds(ids));
    }

    @PostMapping("/updateHouse")
    public ResponseData<Integer> updateHouse(House house){
        return new ResponseData<Integer>("0",houseService.update(house));
    }

}
