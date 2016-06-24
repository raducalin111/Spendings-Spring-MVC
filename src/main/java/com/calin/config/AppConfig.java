package com.calin.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Calin on 6/1/2016.
 */

//@Configuration
//@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {

    private static final String PREFIX = "/WEB-INF/views/";
    private static final String SUFFIX = ".jsp";

//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix(PREFIX);
//        internalResourceViewResolver.setSuffix(SUFFIX);
//        return internalResourceViewResolver;
//    }

}
