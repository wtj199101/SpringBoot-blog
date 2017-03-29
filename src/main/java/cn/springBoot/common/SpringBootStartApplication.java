package cn.springBoot.common;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import cn.springBoot.testController.Application;

/**
 * 若需要部署到外部的tomcat容器中，则添加下面类即可。
 * @author Administrator
 *
 */
public class SpringBootStartApplication  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
