package com.sandeep.herokudemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "sandeep says hi";
    }
    @RequestMapping(value = "/sandeep", method = RequestMethod.GET)
    public String check(){
        return "sandeep says hi with url /sandeep";
    }
}
