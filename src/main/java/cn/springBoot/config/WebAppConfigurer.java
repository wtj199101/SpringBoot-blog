package cn.springBoot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.springBoot.config.interceptor.LoginInterceptor;

/**
 * 拦截器配置
 * @author Administrator
 *
 */
@Configuration
@EnableWebMvc //WebMvcAutoConfiguration不生效了
public class WebAppConfigurer extends WebMvcConfigurerAdapter{
    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO Auto-generated method stub
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截

        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/favicon.ico");


        super.addInterceptors(registry);
    }
    /**
     * 添加自定义的静态资源映射
      这里使用代码的方式自定义目录映射，并不影响Spring Boot的默认映射，可以同时使用。
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      registry.addResourceHandler("/**").addResourceLocations("classpath:/css/**")
      .addResourceLocations("classpath:/images/**")
      .addResourceLocations("classpath:/js/**");
        super.addResourceHandlers(registry);
    }

}
