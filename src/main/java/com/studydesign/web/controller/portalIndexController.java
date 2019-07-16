package com.studydesign.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/index")
public class portalIndexController {

 @GetMapping("/getIndex")
    public void getIndex(){
        System.out.print("");
    }

}
