package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Worker;
import com.example.communitysystem.service.WorkerService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
public class WorkerController {
//下岗职工表
    @Autowired
    private WorkerService workerService;

    @PostMapping("/insertWorker")
    public ResponseData<Integer> insertHouse(Worker worker){
        return new ResponseData("0",workerService.insert(worker));
    }

    @GetMapping("/getAllWorker")
    public ResponseData<List<Worker>> getAllWorker(){
        return new ResponseData("0",workerService.selectAll());
    }

    @GetMapping("/getWorkerByName")
    public ResponseData<List<Worker>> getWorkerByName(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name){
        return new ResponseData("0",workerService.selectByName(name));
    }

    @PostMapping("/deleteWorkerById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData("0",workerService.deleteById(id));
    }

    @PostMapping("/deleteWorkerByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        return new ResponseData("0",workerService.deleteByIds(ids));
    }

    @PostMapping("/updateWorker")
    public ResponseData<Integer> updateWorker(Worker worker){
        return new ResponseData("0",workerService.update(worker));
    }

}
