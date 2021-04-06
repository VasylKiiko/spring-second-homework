package com.Kiiko.springcourse.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean, Validator {
    private String name;
    private int value;

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--- destroy (DisposableBean) from bean A ---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--- afterPropertiesSet (InitializingBean) from bean A ---");
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
}
