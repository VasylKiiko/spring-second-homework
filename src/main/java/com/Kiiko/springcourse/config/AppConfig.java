package com.Kiiko.springcourse.config;

import com.Kiiko.springcourse.beans.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@Configuration
@EnableConfigurationProperties
@PropertySource("classpath:beans.properties")
public class AppConfig {

    @Bean(value = "beanB", initMethod = "initMethod", destroyMethod = "destroyMethod")
    @DependsOn("beanD")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(value = "beanC", initMethod = "initMethod", destroyMethod = "destroyMethod")
    @DependsOn("beanB")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean(value = "beanD", initMethod = "initMethod", destroyMethod = "destroyMethod")
    public BeanD beanD() {
        return new BeanD();
    }
}
