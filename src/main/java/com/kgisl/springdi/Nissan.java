package com.kgisl.springdi;

import org.springframework.stereotype.Component;

@Component // Nissan class is marked as a Spring component
public class Nissan {
    {
        System.out.println("***Nissan***");
    }

    Nissan() {
        System.out.println("Nissan constructor");
    }

}
