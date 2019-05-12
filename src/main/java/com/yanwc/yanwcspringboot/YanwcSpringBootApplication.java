package com.yanwc.yanwcspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *yanwenchang
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
//该注解的作用是，排除自动注入数据源的配置（取消数据库配置），一般使用在客户端（消费者）服务中
//在这个注解中添加exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class}
//即可无数据库运行
public class YanwcSpringBootApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");  热部署,
        // 目录下的WEB-INF文件夹内容修改不重启
        //spring.devtools.restart.exclude: WEB-INF/**
       SpringApplication.run(YanwcSpringBootApplication.class, args);
       System.out.println("(♥◠‿◠)ﾉﾞ  Yanwc SpringBoot 启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
