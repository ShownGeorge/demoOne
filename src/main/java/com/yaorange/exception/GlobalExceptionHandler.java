package com.yaorange.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionHandler implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		if(ex instanceof MyException){//自定义异常
			System.out.println(ex.getMessage()+"那你得改");
			modelAndView.setViewName("error");
			modelAndView.addObject("msg", ex.getMessage());
		}else{				//系统异常
			System.out.println(ex.getMessage()+"是系统的异常");
		}
		return modelAndView;
	}

}
