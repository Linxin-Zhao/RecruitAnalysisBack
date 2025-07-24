package com.example.recruitback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * CORS跨域配置类
 * 用于配置跨域请求的相关参数，允许前端应用访问后端接口
 */
@Configuration
public class CorsConfig {

    /**
     * 配置并注册CorsFilter Bean
     * 允许所有来源、方法和请求头的跨域请求，并允许携带认证信息
     *
     * @return CorsFilter 跨域过滤器实例
     */
    @Bean  // 表示该方法返回的Bean会被Spring IoC容器管理
    public CorsFilter corsFilter() {
        // 创建CorsConfiguration对象并进行相关配置
        CorsConfiguration config = new CorsConfiguration();
        // 允许所有来源的跨域请求（使用pattern匹配）
        config.addAllowedOriginPattern("*");
        // 允许所有HTTP方法的跨域请求
        config.addAllowedMethod("*");
        // 允许所有请求头的跨域请求
        config.addAllowedHeader("*");
        // 允许跨域请求携带认证信息（如Cookie）
        config.setAllowCredentials(true);

        // 创建基于URL的配置源
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 对所有路径应用上述CORS配置
        source.registerCorsConfiguration("/**", config);

        // 返回配置好的CorsFilter
        return new CorsFilter(source);
    }
}
