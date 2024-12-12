package org.example.qualifier;

import org.springframework.stereotype.Component;

@Component
public class CocaCola implements ColdDrink{
    @Override
    public void drink() {
        System.out.println("Drinking cocacola");
    }
}
