package com.lillanm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//不加载springMVC的bean的两种方法：
//1.分开加载
//@ComponentScan({"com.lillanm.service","com.lillanm.dao"})
//2.排除
@ComponentScan(value = "com.lillanm",
    excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            classes = Controller.class
    ))
public class SpringConfig {
}
