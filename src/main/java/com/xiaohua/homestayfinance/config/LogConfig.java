package com.xiaohua.homestayfinance.config;


import  com.xiaohua.homestayfinance.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author langxiaohua
 * date 2020-03-17
 */
@Configuration public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public User logMethod() {
        LOG.info("==========print log==========");
        return new User();
    }
}