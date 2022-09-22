package com.example.hellohtml.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class HelloWorldController {

    ///get  the static index.html
    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public  String helloWorld(){
        log.info("HellowWorldController::index()");
        return  "index.html";
    }

    ///get the static about.html
    @RequestMapping(path = "/about",method = RequestMethod.GET)
    public  String about(){
        log.info("HellowWorldController::about()");
        return "about.html";
    }

    ///get the static contact.html
    @RequestMapping(path = "/contact",method = RequestMethod.GET)
    public  String contact(){
        log.info("HellowWorldController::about()");
        return "contact.html";
    }


}
