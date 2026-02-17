package bms.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class bmsApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(bmsApplication.class,args);
    }
} 
