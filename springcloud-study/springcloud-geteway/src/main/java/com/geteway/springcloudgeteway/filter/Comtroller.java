package com.geteway.springcloudgeteway.filter;

import com.geteway.springcloudgeteway.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Comtroller {

    @Autowired
    MessageService messageService;

    @RequestMapping("/dome")
    public String getMessage(){
        System.out.println("哈哈哈");
        return messageService.getMessage();
    }
}
