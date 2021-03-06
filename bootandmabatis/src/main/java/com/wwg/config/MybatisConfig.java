package com.wwg.config;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by wwg on 2017/9/19.
 */
@Configuration
@ComponentScan
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(ApplicationContext applicationContext) throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath*:mapper/*.xml"));
        return sessionFactory;
    }

    /**
     * 集成分页插件
     * @return
     */
    private PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("value","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
