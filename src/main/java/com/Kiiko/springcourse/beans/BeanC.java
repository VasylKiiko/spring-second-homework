package com.Kiiko.springcourse.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC implements Validator{
    @Value("${bean.c.name}")
    private String name;
    @Value("${bean.c.value}")
    private int value;

    public void initMethod() {
        System.out.println("---init method bean C---");
    }

    public void destroyMethod() {
        System.out.println("---destroy method bean C---");
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
