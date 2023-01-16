package cn.uninasa.cascade_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class CascadeTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CascadeTestApplication.class, args);
        System.out.println("----------------------------");
        System.out.println("启动成功");
        System.out.println("----------------------------");
    }

}
