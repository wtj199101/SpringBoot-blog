package cn.springBoot.common;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * 开启Druid的数据库监控配置
 * @author Administrator
 *
 */
@WebFilter(filterName="druidStatFilter",urlPatterns="/*",initParams={
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
//忽略资源
public class DruidStatFilter extends WebStatFilter {
}
