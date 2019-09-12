package com.message.springcloudmessage.dao.mysql;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import javax.sql.DataSource;

/**
 * mysql数据源
 * 2019-09-10
 * @author bo.cheng
 */
@Configuration
@MapperScan(value = MessageMysqlDbConfig.MYSQL_PACK ,sqlSessionFactoryRef = "dbMysqlSessionFactory")
public class MessageMysqlDbConfig {

    static final String MYSQL_PACK = "com.message.springcloudmessage.dao.mysql";

    static final String MYSQl_MAPPER = "classpath:mysql/*.xml";

    @Primary
    @Bean("getMysqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql")
    public DataSource getMysqlDataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        return dataSource;
    }

    @Bean("dbMysqlTransactionManager")
    public DataSourceTransactionManager dbMysqlTransactionManager(){
        return new DataSourceTransactionManager(getMysqlDataSource());
    }

    @Primary
    @Bean("dbMysqlSessionFactory")
    public SqlSessionFactory dbMysqlSessionFactory(@Qualifier("getMysqlDataSource") DataSource dataSource)
        throws  Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MessageMysqlDbConfig.MYSQl_MAPPER));
        return sessionFactory.getObject();
    }
}
