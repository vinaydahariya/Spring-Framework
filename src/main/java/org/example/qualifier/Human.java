package org.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {

    @Autowired
//    @Qualifier("pepsi2")
    ColdDrink coldDrink;

    public void tryColdDrink(){
        coldDrink.drink();
    }

}
