package com.fss.demoB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
@RestController
@RequestMapping("/demoB")
@Slf4j
public class DemoBController {
	  @Autowired
	    private RestTemplate restTemplate;
	
	 @GetMapping("/greetmessage")
	    public String greetMessage() {
	       log.info("Inside greetMessage method of DemoBController");

	      String msg="Hello Welcome to DemoA";
	    //  ResponseTemplateVO vo = new ResponseTemplateVO();

	      String message =
	              restTemplate.getForObject("http://desktop-p4vd1lt:8200/demoA/message" ,String.class);

	        return msg+"----"+message;
	    }

}
