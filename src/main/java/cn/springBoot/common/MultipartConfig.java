package cn.springBoot.common;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Configuration;

/**
 * springboot里默认使用tomcat的上传文件大小限制，即1MB， 
 * @author Administrator
 *
 */
@Configuration
public class MultipartConfig {
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory mf=new MultipartConfigFactory();
        mf.setMaxFileSize("10MB");
        mf.setMaxRequestSize("10MB");
        return mf.createMultipartConfig();
    }
}
