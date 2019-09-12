package com.message.springcloudmessage.service.mysql;

import com.message.springcloudmessage.entity.StudyUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author bo.cheng
 */
public interface StudyUserMysqlService {

    /**
     * 获取用户信息
     * @return 用户数据
     */
    StudyUser findMysqlStudyUser();

}
