package cn.springBoot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages={"cn.springBoot"})  //The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
@ServletComponentScan//不加这个filter不生效
public class MyBootApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyBootApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
