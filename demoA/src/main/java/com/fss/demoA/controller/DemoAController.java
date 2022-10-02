package com.fss.demoA.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/demoA")
@Slf4j
public class DemoAController {
	  @GetMapping("/message")
	    public String getMessage() {
	       log.info("Inside getMessage method of DemoAController");
	        Date createDated=new Date();
	        String msg="Hi !! WelCome to DemoB"+": Date:"+createDated.toString();
	        return msg;
	    }
}
