package cn.springboot.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
/**
 * 防止xss 攻击 。非法字符拦截器
 * @author Administrator
 *
 */
@WebFilter(urlPatterns="/*",filterName="illegalCharacterFilter")
public class IllegalCharacterFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req=  (HttpServletRequest) request;
        //先对请求地址过滤 ,再对请求参数过滤
//        req.getRequestURI();
        req=new WrapperServletRequest(req);
        chain.doFilter(req, response);
    }

    @Override
    public void destroy() {
        
    }

}
