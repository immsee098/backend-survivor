package com.hsy.api.rest.demo;

import com.hsy.api.rest.demo.controllers.*;
import com.hsy.api.rest.demo.services.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);

        PostService postService = context.getBean("postService", PostService.class);
        PostController postController = context.getBean("postController", PostController.class);
        System.out.println("-".repeat(80));
        System.out.println(postController);
    }

    @Bean
    public PostService postService() {
        return new PostService();
    }

    @Bean
    public GetPostDTOListService getPostDTOListService() {
        return new GetPostDTOListService();
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**") // /posts 같이 나눠서 써도됨
                        .allowedMethods("GET", "POST", "PATCH", "DELETE", "OPTIONS")
                        .allowedOrigins("https://seed2whale.github.io");
            }
        };
    }

}
