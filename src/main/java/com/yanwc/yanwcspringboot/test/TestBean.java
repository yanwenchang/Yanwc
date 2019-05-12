package com.yanwc.yanwcspringboot.test;

public class TestBean {

    private String username;
    private String url;
    private String password;

    @Override
    public String toString() {
        return "TestBean{" +
                "username='" + username + '\'' +
                ", url='" + url + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void start(){
        System.out.println("TestBean 初始化。。。");
    }

    public void cleanUp() {
        System.out.println("TestBean 销毁。。。");
    }

    public void sayHello() {
        System.out.println("TestBean sayHello...");
    }
}
