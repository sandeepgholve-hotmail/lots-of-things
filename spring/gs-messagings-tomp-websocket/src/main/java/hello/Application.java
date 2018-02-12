package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /*ConfigurableApplicationContext applicationContext = null;
        try {
            applicationContext = SpringApplication.run(Application.class, args);
        } finally {
            if (applicationContext != null && applicationContext.isActive()) {
                applicationContext.close();
            }
        }*/
        SpringApplication.run(Application.class, args);
    }
}
