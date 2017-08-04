package cn.springBoot.config.globalerr;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/***
 * 全局异常处理在spring 3.2中,新增了@ControllerAdvice 注解可以用于定义
 * @ExceptionHandler、@InitBinder、@ModelAttribute,并应用到所有@RequestMapping中。
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @Value(value="${errpage}")
    private  String DEFAULT_ERROR_VIEW;

    @ExceptionHandler(Exception.class)
    public ModelAndView formatErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        if (e instanceof  ArithmeticException){
          return null;
        }else{
        ModelAndView mav = new ModelAndView();
        System.out.println("############### 发生 #error# exception ="+e.getLocalizedMessage());
        mav.addObject("error","服务器发生错误");
        mav.addObject("exception", e);
//        mav.addObject("url", RequestUtils.getCompleteRequestUrl(req));
        mav.addObject("timestamp", Calendar.getInstance().getTime());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
        }
    }
}
