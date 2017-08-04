package cn.springBoot.config.globalerr;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.boot.autoconfigure.web.BasicErrorController;
//import org.springframework.boot.autoconfigure.web.DefaultErrorViewResolver;
//import org.springframework.boot.autoconfigure.web.ErrorAttributes;
//import org.springframework.boot.autoconfigure.web.ErrorProperties;
//import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
///**
//自定义异常页面
//@Controller
////ErrorMvcAutoConfiguration 参考这个类
////* <li>{@code '/<templates>/error/404.<ext>'}</li>
////* <li>{@code '/<static>/error/404.html'}</li>
////* <li>{@code '/<templates>/error/4xx.<ext>'}</li>
////* <li>{@code '/<static>/error/4xx.html'}</li>
//public class GlobalErrorController extends BasicErrorController  {
//
//    public GlobalErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties,
//            List<ErrorViewResolver> errorViewResolvers) {
//        super(errorAttributes, errorProperties, errorViewResolvers);
//    }
//    public GlobalErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
//        super(errorAttributes, errorProperties);
//    }
//    @Override
//    @RequestMapping(produces = "text/html")
//    public ModelAndView errorHtml(HttpServletRequest request,
//                    HttpServletResponse response) {
//            HttpStatus status = getStatus(request);
//            Map<String, Object> model = Collections.unmodifiableMap(getErrorAttributes(
//                            request, isIncludeStackTrace(request, MediaType.TEXT_HTML)));
//            response.setStatus(status.value());
//            ModelAndView modelAndView = resolveErrorView(request, response, status, model);
//
//            return modelAndView;
//    }
//    @Override
//    @RequestMapping
//    @ResponseBody
//    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
//            Map<String, Object> body = getErrorAttributes(request,
//                            isIncludeStackTrace(request, MediaType.ALL));
//            HttpStatus status = getStatus(request);
//            return new ResponseEntity<Map<String, Object>>(body, status);
//    }
//
//
//
//
//}
