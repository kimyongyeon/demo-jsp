package com.example.demotemplatejsp;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class DemoMvc {

    /**
     * 瑁呴グ鍣�
     * @return
     * 2016骞�8鏈�27鏃ヤ笅鍗�12:37:20
     */
    @Bean
    public FilterRegistrationBean siteMeshFilter(){
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new SomeFilter());
        registrationBean.setOrder(1);
        registrationBean.addUrlPatterns("*.do", "*.go");    //filter를 거칠 url patterns
        return registrationBean;
    }

    @Bean(name = "someFilter")
    public Filter someFilter() {
        return new SomeFilter();
    }

}
