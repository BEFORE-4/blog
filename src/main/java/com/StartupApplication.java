package com;

import com.blog.common.CommonInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ImportResource(locations = {"classpath:beans.xml"})        //此注解引入beans.xml文件到springboot中
@SpringBootApplication
@EnableScheduling //定时任务
public class StartupApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }

    @Autowired
    CommonInterceptor interceptor;

    //增加拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
