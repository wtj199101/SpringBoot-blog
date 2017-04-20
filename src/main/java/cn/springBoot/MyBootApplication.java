package cn.springBoot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.springBoot"})  //The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
public class MyBootApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyBootApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
