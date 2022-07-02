package com.example.communitysystem.controller;

import com.example.communitysystem.entity.Dispute;
import com.example.communitysystem.entity.PublicSecurity;
import com.example.communitysystem.service.DisputeService;
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
//纠纷记录管理
@RestController
public class DisputeController {

    @Autowired
    private DisputeService disputeService;

    @PostMapping("/insertDispute")
    public ResponseData<Integer> insertDispute(Dispute dispute){
        return new ResponseData("0",disputeService.insert(dispute));
    }

    @GetMapping("/getAllDispute")
    public ResponseData<List<Dispute>> getAllDispute(){
        return new ResponseData("0",disputeService.selectAll());
    }

    @GetMapping("/getDisputeById")
    public ResponseData<List<Dispute>> getDisputeById(@RequestParam String id){
        return new ResponseData("0",disputeService.selectById(id));
    }

    @PostMapping("/deleteDisputeById")
    public ResponseData<Integer> deleteDisputeById(@RequestParam String id){
        return new ResponseData("0",disputeService.deleteById(id));
    }

    @PostMapping("/deleteDisputeByIds")
    public ResponseData<Integer> deleteDisputeByIds(@RequestParam List<String> ids){
        return new ResponseData("0",disputeService.deleteByIds(ids));
    }

    @PostMapping("/updateDispute")
    public ResponseData<Integer> updateDispute(Dispute dispute){
        return new ResponseData("0",disputeService.update(dispute));
    }

}
