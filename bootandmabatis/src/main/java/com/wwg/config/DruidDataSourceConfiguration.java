package com.wwg.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据源Bean
 * 连接池
 * Created by wwg on 2017/9/19.
 */
@Configuration
public class DruidDataSourceConfiguration {

    private Logger logger = LoggerFactory.getLogger(DruidDataSourceConfiguration.class);

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean    //声明其为Bean实例
    @Primary    //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        //验证数据库连接的有效性
        //dataSource.setValidationQuery("select * from teach_book where book_id=1");

        logger.info(dataSource.toString());
        return dataSource;
    }
}
