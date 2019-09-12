package com.message.springcloudmessage.dao.mysql.mapper;

import com.message.springcloudmessage.entity.StudyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author bo.cheng
 */
public interface StudyUserMysqlMapper {

    /**
     * 获取用户信息
     * @return 用户数据
     */
    public StudyUser findMysqlStudyUser();
}
