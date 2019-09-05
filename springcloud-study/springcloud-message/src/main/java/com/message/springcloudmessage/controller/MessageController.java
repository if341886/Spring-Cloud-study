package com.message.springcloudmessage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/atudy")
public class MessageController {

    @PostMapping("/getMessage")
    public String getMessage(){
        return "欢迎";
    }

}
