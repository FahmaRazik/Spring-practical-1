package lk.nibm.ead2;

import lk.nibm.ead2.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HelloComponent {
    @Autowired
    IHelloService service;

    public void print(){
        System.out.println(service.sayHello());
    }
}

