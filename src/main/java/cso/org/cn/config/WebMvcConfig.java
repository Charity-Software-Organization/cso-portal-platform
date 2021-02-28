package cso.org.cn.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: CSO-Portal-Platform
 * @description: WebMvcConfigurer是Spring内部的一种配置方式
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-27 23:18
 */
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     *@Description: 设置跨域
     *@Param: [registry]
     *@return: void
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/27
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "HEAD", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "TRACE")
                .maxAge(3600);
    }

    /**
     *@Description: 拦截该拦截器用于在实现mybatis-plus逻辑删除
     *@Param: []
     *@return: com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/27
     */
    @Bean
    public OptimisticLockerInterceptor OptimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    /**
     *@Description: 配置图片映射路径
     *@Param: [registry]
     *@return: void
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/27
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //材料图片路径
        // registry.addResourceHandler("/clImg/**").addResourceLocations("file:D:\\mibImg\\clImg\\");
        //流程图路径
        // registry.addResourceHandler("/lcImg/**").addResourceLocations("file:D:\\mibImg\\lcImg\\");
        //动态内容
        // registry.addResourceHandler("/dtImg/**").addResourceLocations("file:D:\\mibImg\\dtImg\\");

        registry.addResourceHandler("/clImg/**").addResourceLocations("file:///home/mibImg/clImg/");
        registry.addResourceHandler("/lcImg/**").addResourceLocations("file:///home/mibImg/lcImg/");
        registry.addResourceHandler("/dtImg/**").addResourceLocations("file:///home/mibImg/dtImg/");
    }

}