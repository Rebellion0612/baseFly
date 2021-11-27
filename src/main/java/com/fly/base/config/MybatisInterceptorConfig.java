package com.fly.base.config;

import com.fly.base.interceptor.ModifyInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Phoenix Fly
 * @create 2021/11/7 22:12
 */
@Configuration
public class MybatisInterceptorConfig {
    @Bean
    public String myInterceptor(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addInterceptor(new ModifyInterceptor());
        return "interceptor";
    }
}
