package com.spring;

import com.spring.domain.Person;
import com.spring.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);
        context.register(Demo.class);

        PersonService service = context.getBean(PersonService.class);
        Person ivan = service.getByName("ivan");
        System.out.println(ivan);
    }
}
