package lk.nibm.ead2.service.config;

import lk.nibm.ead2.service.IHelloService;
import lk.nibm.ead2.service.impl.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class HelloConfig {

    @Bean
    public IHelloService helloService(){
        return new HelloService();
    }

}
