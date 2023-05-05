//package com.example.authservice.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfiguration implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**") // This allows CORS for all endpoints in your application
//                .allowedOriginPatterns("*") // You can specify specific origins instead of '*' if needed
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
//                .allowedHeaders("*") // Allowed headers, or you can specify a list of headers
//                .allowCredentials(true)
//                .maxAge(3600); // Max age for the pre-flight requests (OPTIONS)
//    }
//}
