package com.Kiiko.springcourse.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bean.c")
public class BeanC implements Validator{
    private String name;
    private int value;

    public void initMethod() {
        System.out.println("---init method bean C---");
    }

    public void destroyMethod() {
        System.out.println("---destroy method bean C---");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void validate() {
        if (name == null) {
            System.out.println("Invalid name parameter!");
            return;
        }
        if (value < 0) {
            System.out.println("Invalid value parameter!");
        }
    }

    @Override
    public String toString() {
        return "name = " + name + ", value = " + value;
    }
}
