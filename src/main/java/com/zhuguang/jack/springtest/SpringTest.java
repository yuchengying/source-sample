package com.zhuguang.jack.springtest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Service;

@Service
public class SpringTest implements BeanDefinitionRegistryPostProcessor{

    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // TODO Auto-generated method stub
        
    }

    public void postProcessBeanDefinitionRegistry(
            BeanDefinitionRegistry registry) throws BeansException {
        ClassPathBeanDefinitionScanner cpds = new ClassPathBeanDefinitionScanner(registry);
        cpds.addIncludeFilter(new AnnotationTypeFilter(MyAnnotation.class));
        System.out.println(cpds.scan("com.zhuguang.jack"));
    }
    
}
