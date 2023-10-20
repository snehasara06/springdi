package com.kgisl.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.kgisl.springdi")
public class AppContext {

    {
        System.out.println("---App context---");
    }
    @Bean
    @Scope("prototype")
    public Nissan nissan(){
        return new Nissan();
    }

}
