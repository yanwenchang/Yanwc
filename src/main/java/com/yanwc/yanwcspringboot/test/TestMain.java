package com.yanwc.yanwcspringboot.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

        //获取bean
        TestBean tb = (TestBean) context.getBean("testBean");
        tb.sayHello();
    }
}
