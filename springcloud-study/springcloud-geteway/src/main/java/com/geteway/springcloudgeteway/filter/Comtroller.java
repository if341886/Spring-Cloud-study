package com.geteway.springcloudgeteway.filter;

import com.geteway.springcloudgeteway.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/geteway")
public class Comtroller {

    @Autowired
    MessageService messageService;

    @RequestMapping("/getName")
    public String getMessage(){
        return messageService.getMessage();
    }

    @RequestMapping("/getDate")
    public  String getDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(System.currentTimeMillis());
    }
}
