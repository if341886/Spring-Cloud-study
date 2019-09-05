package com.geteway.springcloudgeteway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "study-message",path = "/atudy")
public interface MessageService {

    @RequestMapping(value = "/getMessage" , method = RequestMethod.POST)
    public String getMessage();

    @RequestMapping(value = "/setMessage" , method = RequestMethod.POST)
    public String setMessage(@RequestParam("message") String message);

}
