package com.example.restful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestConnection {

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String  getMethon(){
        return   "methond";
    }
}
