package com.expresshelper.singlepage.exception;

/**
 * @author fanminfeng
 * @version 1.0
 * _                 __      __   _ _
 * | |                \ \    / /  | | |
 * | | ___  ___ ___  __\ \  / /__ | | | ____ _
 * _   | |/ _ \/ __/ __|/ _ \ \/ / _ \| | |/ / _` |
 * | |__| |  __/\__ \__ \  __/\  / (_) | |   < (_| |
 * \____/ \___||___/___/\___| \/ \___/|_|_|\_\__,_|
 * @date 2019/8/29 下午2:40
 */

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());

        mav.setViewName("errorPage");
        return mav;
    }

}
