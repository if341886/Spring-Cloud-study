package com.message.springcloudmessage.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/atudy")
public class MessageController {

    @Value("${name}")
    private String name;

    @PostMapping("/getMessage")
    public String getMessage(){
        return "欢迎" + name;
    }

}
