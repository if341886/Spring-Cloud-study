package com.message.springcloudmessage.serviceimpl.mysql;

import com.message.springcloudmessage.dao.mysql.mapper.StudyUserMysqlMapper;
import com.message.springcloudmessage.entity.StudyUser;
import com.message.springcloudmessage.service.mysql.StudyUserMysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author bo.cheng
 */
@Service
public class StudyUserMysqlServiceImpl implements StudyUserMysqlService {

    @Autowired
    private StudyUserMysqlMapper studyUserMapper;

    @Override
    public StudyUser findMysqlStudyUser() {
        return studyUserMapper.findMysqlStudyUser();
    }
}
