package com.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-14 23:04
 **/
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 指定root容器对应的配置类
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MapperJavaConfig.class, ServiceJavaConfig.class, DataSourceJavaConfig.class};
    }

    /**
     * 指定web容器对应的配置类
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebJavaConfig.class};
    }

    /**
     * 指定dispatcherServlet处理路径，通常为 /
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
