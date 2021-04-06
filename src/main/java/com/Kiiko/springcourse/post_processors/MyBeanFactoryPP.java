package com.Kiiko.springcourse.post_processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("--- postProcessBeanFactory in MyBeanFactoryPP---");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("beanB");
        beanDefinition.setInitMethodName("secondInitMethod");
    }
}
