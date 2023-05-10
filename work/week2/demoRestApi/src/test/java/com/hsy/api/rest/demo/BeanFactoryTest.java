package com.hsy.api.rest.demo;

import com.fasterxml.jackson.databind.*;
import com.hsy.api.rest.demo.controllers.*;
import com.hsy.api.rest.demo.services.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.config.*;
import org.springframework.beans.factory.support.*;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class BeanFactoryTest {

    @Test
    @DisplayName("Spring IOC 컨테이너를 통해 PostCOntroller 해서 얻기넣기")
    void getObjectMapper() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(ObjectMapper.class);

        beanFactory.registerBeanDefinition("objectMapper", beanDefinition);

        ObjectMapper objectMapper = beanFactory.getBean("objectMapper", ObjectMapper.class);

        assertThat(objectMapper).isNotNull();
    }

    @Test
    @DisplayName("Spring IOC 컨테이너를 통해 PostCOntroller 해서 얻기넣기")
    void getPostController() {
        GetPostDTOListService getPostDTOListService = new GetPostDTOListService();
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(PostController.class);
        ConstructorArgumentValues constructorArgs = new ConstructorArgumentValues();
        constructorArgs.addIndexedArgumentValue(0, "getPostDTOListService");
        constructorArgs.addIndexedArgumentValue(1, "postService");
        beanDefinition.setConstructorArgumentValues(constructorArgs);

        beanFactory.registerBeanDefinition("postController", beanDefinition);

        PostController postController = beanFactory.getBean("postController", PostController.class);

        assertThat(postController).isNotNull();
    }
}
