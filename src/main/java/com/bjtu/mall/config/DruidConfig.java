package com.bjtu.mall.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author yinzhiqiang
 * @date 2020/7/4 9:37
 */
@Configuration
public class DruidConfig {
    @Bean(destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource() {
        return new DruidDataSource();
    }
}
