package com.example.securitymasterdemo.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class GlobalErrorController {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage());
        return "error";
    }
}
