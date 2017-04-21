package cn.springBoot.config.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
/**
 * 特殊字符过滤
 * @author Administrator
 *
 */
public class WrapperServletRequest extends HttpServletRequestWrapper {
    public WrapperServletRequest(HttpServletRequest req){
        super(req);
    }

    @Override
    public String getParameter(String name) {
        return XssfieldUtil.stripXss(super.getParameter(XssfieldUtil.stripXss(name)));
    }

    @Override
    public String[] getParameterValues(String name) {
        // 返回值之前 先进行过滤
        String[] values = super.getParameterValues(XssfieldUtil.stripXss(name));
        if(values != null){
            for (int i = 0; i < values.length; i++) {
                values[i] = XssfieldUtil.stripXss(values[i]);
            }
        }
        return values;
    }

}
