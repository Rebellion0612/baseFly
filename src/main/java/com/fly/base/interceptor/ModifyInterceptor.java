package com.fly.base.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.sql.Statement;

/**
 * @Author Phoenix Fly
 * @create 2021/11/7 22:14
 */

@Intercepts(@Signature(type = StatementHandler.class, method = "update", args = {Statement.class}))
@Slf4j
public class ModifyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        return invocation.proceed();
    }
}
