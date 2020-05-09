package com.project.config;


import com.project.interceptor.ClientAppInterceptor;
import com.project.interceptor.SysAppInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截app客户端所有请求
        registry.addInterceptor(new ClientAppInterceptor()).addPathPatterns("/clientApi/**")
                .excludePathPatterns("/clientApi/user/login");

        // 拦截app物业端所有请求
        registry.addInterceptor(new SysAppInterceptor()).addPathPatterns("/sysApi/**")
                .excludePathPatterns("/sysApi/user/login");
    }
}
