package com.message.springcloudmessage.dao.oracle.mapper;

import com.message.springcloudmessage.entity.StudyUser;

/**
 * @author bo.cheng
 */
public interface StudyUserOracleMapper {

    /**
     * 获取用户信息
     * @return 用户数据
     */
    public StudyUser getOracleStudyUser();
}
