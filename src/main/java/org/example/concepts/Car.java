package org.example.concepts;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements InitializingBean, DisposableBean {

    // manually creating object and injecting to it
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("setting using constructor");
    }

    public Car(){
        System.out.println("Car is instantiated");
    }

    public Engine getEngine() {
        return engine;
    }

    // setter method
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("setting engine : setter injection");
    }

    public void start(){
        // car start nhi ho sakti hai
        // we will need engine
        engine.startEngine();
        System.out.println("Car started...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("We are init after properties set : ");
        System.out.println(engine );
        System.out.println("----------------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("car bean is going to destroy");
        System.out.println("-----------------");
    }
}
