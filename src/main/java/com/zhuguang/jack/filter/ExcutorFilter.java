package com.zhuguang.jack.filter;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

@Intercepts({@Signature(type = Executor.class, method = "query", args = {
        MappedStatement.class, Object.class, RowBounds.class,
        ResultHandler.class})})
public class ExcutorFilter implements Interceptor {
    
    /* 
     * 被代理方法的增强，这个执行完以后，就轮到被代理对象执行
     * executor
     */
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("===========================================");
        //这个就是对被代理对象的调用
        return invocation.proceed();
    }
    
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            //这个方法返回的是一个代理对象，代理的是target
            return Plugin.wrap(target, this);
        }
        
        return target;
    }
    
    public void setProperties(Properties properties) {
        // TODO Auto-generated method stub
        
    }
}
