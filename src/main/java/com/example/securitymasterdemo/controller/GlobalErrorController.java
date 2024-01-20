package com.example.securitymasterdemo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GlobalErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleRequest(HttpServletRequest request,Model model){
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        Object message = request.getAttribute(RequestDispatcher.ERROR_MESSAGE);

        if(status != null){
            int statusCode = Integer.parseInt(status.toString());
            model.addAttribute("statusCode",statusCode);
            model.addAttribute("message",message);
        } else{
            model.addAttribute("statusCode","Not identified");
            model.addAttribute("message","No Message");
        }
        return "error";
    }

}
