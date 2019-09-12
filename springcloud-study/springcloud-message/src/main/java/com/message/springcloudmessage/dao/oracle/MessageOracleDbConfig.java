package com.message.springcloudmessage.dao.oracle;

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
 * oracle 数据源
 * 2019-09-12
 * @author bo.cheng
 */
@Configuration
@MapperScan(value = MessageOracleDbConfig.ORACLE_PACK,sqlSessionFactoryRef = "dbOraclesqlSessionFactory")
public class MessageOracleDbConfig {

    static final String ORACLE_PACK = "com.message.springcloudmessage.dao.oracle";

    static final String ORACLE_MAPPER = "classpath:oracle/*.xml";

    @Bean(value = "getOracleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    public DataSource getOracleDataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        return dataSource;
    }

    @Bean(value =  "dbOracleTransctionManager")
    public DataSourceTransactionManager dbOracleTransctionManager(){
        return new DataSourceTransactionManager(getOracleDataSource());
    }

    @Bean(value = "dbOraclesqlSessionFactory")
    public SqlSessionFactory dbOraclesqlSessionFactory(@Qualifier("getOracleDataSource") DataSource dataSource)
        throws Exception{
        final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MessageOracleDbConfig.ORACLE_MAPPER));
        return factoryBean.getObject();
    }

}
