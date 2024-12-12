package org.example.concepts;

import org.example.college.Teacher;
import org.example.qualifier.ColdDrink;
import org.example.qualifier.Pepsi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class ConfigClass {

    @Bean
    public Teacher getTeacher(){
        return new Teacher();
    }

    @Bean(name = "pepsi2")
    public ColdDrink getColdDrink(){
        return new Pepsi();
    }

}
