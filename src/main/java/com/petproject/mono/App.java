package com.petproject.mono;


import com.petproject.mono.beans.Message;
import com.petproject.mono.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( "com.petproject.mono" )
public class App {


    public static void main(String[] args) {
        System.out.println("Hello Maven!");

        //в скобках указываем точку входа?
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        User user = ctx.getBean("user", User.class);
        //почему null?
        Message message = ctx.getBean("message", Message.class);
        System.out.println(user.getFullName());
        System.out.println(user.getAge());
        System.out.println(user.getId());
        System.out.println(message.getMessage());
        System.out.println(message.getId());




    }
}
