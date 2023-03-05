package lk.nibm.ead2.service.impl;

import lk.nibm.ead2.service.IHelloService;
import org.springframework.stereotype.Service;


public class HelloService implements IHelloService {
    @Override
    public String sayHello() {
        return "Hello Spring";
    }
}


