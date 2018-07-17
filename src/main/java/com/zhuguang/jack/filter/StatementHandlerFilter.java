package com.zhuguang.jack.filter;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;


@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class,Integer.class})})
public class StatementHandlerFilter implements Interceptor{

    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("===================StatementHandlerFilter.intercept===================");
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        // TODO Auto-generated method stub
        if(target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        }
        return target;
    }

    public void setProperties(Properties properties) {
        // TODO Auto-generated method stub
        
    }
    
}
