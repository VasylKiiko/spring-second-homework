package com.Kiiko.springcourse.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements Validator {
    private String name;
    private int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("--- pre-destroy from bean E ---");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("--- post-construct from bean E ---");
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
