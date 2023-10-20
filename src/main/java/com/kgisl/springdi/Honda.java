package com.kgisl.springdi;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Car {

      Honda() {
        System.out.println("---HONDA constructor---");
    }

      @Override
      public void display() {
       System.out.println("Honda Car");
      }
}
