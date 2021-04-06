package com.Kiiko.springcourse.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class BeanD implements Validator {
    @Autowired
    private Environment env;
    private String name;
    private int value;

    public void initMethod() {
        System.out.println("---init method bean D---");
    }

    public void destroyMethod() {
        System.out.println("---destroy method bean D---");
    }

    public void method() {
        name = env.getProperty("bean.d.name");
        value = Integer.parseInt(env.getProperty("bean.d.value"));
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
