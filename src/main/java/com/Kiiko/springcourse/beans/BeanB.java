package com.Kiiko.springcourse.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements Validator {
    @Value("${bean.b.name}")
    private String name;
    @Value("${bean.b.value}")
    private int value;

    public void initMethod() {
        System.out.println("---init method bean B---");
    }

    public void secondInitMethod() {
        System.out.println("---second init method set in BeanFactoryPostProcessor in bean B ---");
    }

    public void destroyMethod() {
        System.out.println("---destroy method bean B---");
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
