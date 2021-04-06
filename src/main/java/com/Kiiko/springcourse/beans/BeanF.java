package com.Kiiko.springcourse.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanF implements Validator {
    private String name;
    private int value;

    public BeanF(String name, int value) {
        this.name = name;
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
