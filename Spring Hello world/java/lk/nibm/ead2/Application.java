package lk.nibm.ead2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        HelloComponent main = context.getBean(HelloComponent.class);
//        HelloComponent HelloComponent = new HelloComponent();
        main.print();
    }
}

