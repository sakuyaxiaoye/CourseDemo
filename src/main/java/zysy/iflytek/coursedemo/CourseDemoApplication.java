package zysy.iflytek.coursedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zysy.iflytek.coursedemo.**.mapper")
public class CourseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseDemoApplication.class, args);
    }

}
