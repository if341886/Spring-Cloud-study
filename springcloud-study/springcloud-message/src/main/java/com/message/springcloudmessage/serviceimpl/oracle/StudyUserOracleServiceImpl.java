package com.message.springcloudmessage.serviceimpl.oracle;



import com.message.springcloudmessage.dao.oracle.mapper.StudyUserOracleMapper;
import com.message.springcloudmessage.entity.StudyUser;
import com.message.springcloudmessage.service.oracle.StudyUserOracleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bo.cheng
 */
@Service
public class StudyUserOracleServiceImpl implements StudyUserOracleService {

    @Autowired
    private StudyUserOracleMapper studyUserOracleMapper;

    @Override
    public StudyUser getStudyOracleService() {
        return studyUserOracleMapper.getOracleStudyUser();
    }
}
