package com.kgisl.springdi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class NissanController {

    {
        System.out.println("Initializer block- Nissan controller");
    }
// @Autowired
    Nissan nissan1;
    Nissan nissan2;

// constructor injection
    NissanController(Nissan nissan1, Nissan nissan2) {
        System.out.println("Constructor block -Nissan controller");
        this.nissan1 = nissan1;
        this.nissan2 = nissan2;
    }

    @GetMapping("/")
    public String getAllNissan() {
        System.out.println(nissan1);
        System.out.println(nissan2);
        System.out.println("Get  All Nissan");
        return "nissan";
    }

    @GetMapping("/nissan")
    public String getOneNissan() {
        System.out.println(nissan1);
        System.out.println(nissan2);
        System.out.println("Get One Nissan");
        return "nissan";
    }
}
