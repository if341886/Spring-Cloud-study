package com.message.springcloudmessage.util;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author bo.cheng
 */
@Configuration
@EnableCaching
public class JedisUtil {

    @Value("${spring.redis.host}")
    private String host;  //IP地址

    @Value("${spring.redis.port}")
    private int port; //端口

    @Value("${spring.redis.database}")
    private int database; //数据库 默认0

    @Value("${spring.redis.timeout}")
    private int timeout; //超时时间

    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle; //最大空闲连接数

    @Value("${spring.redis.pool.mim-idle}")
    private int minIdle;  //最小空闲连接数

    @Value("${spring.redis.pool.max-wait}")
    private long maxWaitMillis; //获取连接时的最大等待毫秒数 默认-1永不超时

    /**
     * 连接redis
     * @return
     */
    @Bean
    public JedisPool redisPoolFactory(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(maxIdle);
        config.setMaxWaitMillis(maxWaitMillis);
        config.setMinIdle(minIdle);
        JedisPool jedisPool = new JedisPool(config,host,port,timeout,null,0);
        return jedisPool;
    }

}
