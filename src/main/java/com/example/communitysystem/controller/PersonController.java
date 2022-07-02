package com.example.communitysystem.controller;


import com.example.communitysystem.entity.Person;
import com.example.communitysystem.service.PersonService;
import com.example.communitysystem.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
//常住人口表
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/insertPerson")
    public ResponseData<Integer> insertPerson(Person person){
        person.setCreateDate(new Date());
        person.setType("迁入");
        return new ResponseData("0",personService.insert(person));
    }

    @GetMapping("/getAllPerson")
    public ResponseData<List<Person>> getAllPerson(){
        return new ResponseData("0",personService.selectAll());
    }

    @GetMapping("/getPersonByNameAndType")
    public ResponseData<List<Person>> getPersonByNameAndType(@RequestParam String page, @RequestParam int limit, @RequestParam(required = false) String name,@RequestParam(required = false) String type){
        return new ResponseData("0",personService.selectByNameAndType(name,type));
    }

    @PostMapping("/deletePersonById")
    public ResponseData<Integer> deleteById(@RequestParam String id){
        return new ResponseData("0",personService.deleteById(id));
    }

    @PostMapping("/deletePersonByIds")
    public ResponseData<Integer> deleteByIds(@RequestParam List<String> ids){
        return new ResponseData("0",personService.deleteByIds(ids));
    }

    @PostMapping("/updatePerson")
    public ResponseData<Integer> updatePerson(Person person){
        return new ResponseData("0",personService.update(person));
    }

}
