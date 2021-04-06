package com.Kiiko.springcourse.config;

import com.Kiiko.springcourse.beans.BeanA;
import com.Kiiko.springcourse.beans.BeanE;
import com.Kiiko.springcourse.beans.BeanF;
import com.Kiiko.springcourse.post_processors.MyBeanFactoryPP;
import org.springframework.context.annotation.*;

@Configuration
@Import(AppConfig.class)
@ComponentScan(value = "com.Kiiko.springcourse.post_processors")
public class AnotherAppConfig {
    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF("beanF", 4);
    }

    @Bean
    public BeanA beanA() {
        return new BeanA("beanA", 5);
    }

    @Bean
    public BeanE beanE() {
        return new BeanE("beanE", 7);
    }
}
