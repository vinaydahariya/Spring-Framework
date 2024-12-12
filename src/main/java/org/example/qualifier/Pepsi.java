package org.example.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pepsi implements ColdDrink{
    @Override
    public void drink() {
        System.out.println("Drinking pepsi");
    }
}
