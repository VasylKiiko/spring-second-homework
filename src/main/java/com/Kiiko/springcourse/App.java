package com.Kiiko.springcourse;

import com.Kiiko.springcourse.beans.BeanB;
import com.Kiiko.springcourse.beans.BeanC;
import com.Kiiko.springcourse.beans.BeanD;
import com.Kiiko.springcourse.beans.BeanF;
import com.Kiiko.springcourse.config.AnotherAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnotherAppConfig.class);
        System.out.println(ctx.getBean(BeanB.class));
        System.out.println(ctx.getBean(BeanC.class));
        BeanD beanD = ctx.getBean(BeanD.class);
        beanD.method();
        System.out.println(beanD);
         BeanF beanF = ctx.getBean(BeanF.class);
        for (String beanDef: ctx.getBeanDefinitionNames()) {
            System.out.println(beanDef);
        }
        ctx.close();
        System.out.println("Finish");
    }
}
