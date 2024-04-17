package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @program: SSM-Demo
 * @description:Springmvc配置类
 *  * 1.实现Springmvc组件声明标准化接口WebMvcConfigurer 提供了各种组件对应的方法
 *  * 2.添加配置类注解@Configuration
 *  * 3.添加mvc复合功能开关@EnableWebMvc (handlermapping;handleradapter;json转换器)
 *  * 4.添加controller层扫描注解
 *  * 5.开启默认处理器,支持静态资源处理
 * @author: David
 * @create: 2024-04-14 18:37
 **/
@Configuration
@EnableWebMvc
@ComponentScan("com.demo")
public class WebJavaConfig implements WebMvcConfigurer {

    /**
     * 开启静态资源
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * 视图解析器
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/", "jsp");
    }

    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor();
    }
}
