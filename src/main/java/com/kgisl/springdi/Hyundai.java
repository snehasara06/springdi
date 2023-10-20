package com.kgisl.springdi;

import org.springframework.stereotype.Component;

@Component
public class Hyundai implements Car {

    Hyundai() {
        System.out.println("---HYUNDAI constructor---");
    }

    @Override
    public void display() {
        System.out.println("Hyundai Car");
    }

}
