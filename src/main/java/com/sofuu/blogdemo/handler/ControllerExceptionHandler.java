package com.sofuu.blogdemo.handler;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import sun.security.provider.certpath.OCSPResponse;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;


@ControllerAdvice
public class ControllerExceptionHandler {

   private final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);


    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e) throws Exception{
        logger.error("Requst URL : {}, Exception : {}", request.getRequestURL(),e );

        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) !=null){
            throw e;

        }
        ModelAndView mov = new ModelAndView();
        mov.addObject("url",request.getRequestURL());
        mov.addObject("exception",e);
        mov.setViewName("error/error");
        return mov;
        }

}
