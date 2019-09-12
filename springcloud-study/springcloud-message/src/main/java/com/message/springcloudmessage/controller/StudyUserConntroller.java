package com.message.springcloudmessage.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.message.springcloudmessage.entity.StudyUser;
import com.message.springcloudmessage.service.mysql.StudyUserMysqlService;
import com.message.springcloudmessage.service.oracle.StudyUserOracleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/studyUser")
public class StudyUserConntroller {

    @Autowired
    private StudyUserMysqlService studyUserService;

    @Autowired
    private StudyUserOracleService studyUserOracleService;

    @RequestMapping(value = "/findMysqlStudyUser")
    public String findMysqlStudyUser() throws JSONException {
        StudyUser studyUser = studyUserService.findMysqlStudyUser();
        String user = JSON.toJSONString(studyUser);
        return user;
    }

    @RequestMapping(value = "/findOracleStudyUser")
    public String findOracleStudyUser() throws JSONException {
        StudyUser studyUser = studyUserOracleService.getStudyOracleService();
        String user = JSON.toJSONString(studyUser);
        return user;
    }
}
