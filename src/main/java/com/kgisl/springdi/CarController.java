package com.kgisl.springdi;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

@ComponentScan(basePackages = "com.kgisl.springdi")
@Controller
public class CarController {
    {
        System.out.println("CAR controller");
    }
  @Resource
  Car car;
  public void print(){
    System.out.println();
  }
}
