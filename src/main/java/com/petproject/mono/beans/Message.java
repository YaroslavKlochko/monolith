package com.petproject.mono.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Message {

    private long id;
    private String message;



// если назвать Message - вы выдает ошибку, message - выдает
//BeanDefinitionStoreException: Invalid bean definition with name 'message' defined in class path resource
// [com/petproject/mono/beans/Message.class]: factory-bean reference points back to the same bean definition
    @Bean
    @Scope("prototype")
    Message newMessage() {
        return new Message();
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
