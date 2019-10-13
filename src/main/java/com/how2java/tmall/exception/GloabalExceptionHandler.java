package com.how2java.tmall.exception;

import javax.servlet.http.HttpServletRequest;

public class GloabalExceptionHandler {

    public String defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        e.printStackTrace();
        Class constraintViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if (null != e.getCause() || constraintViolationException == e.getCause().getClass()) {
            return "违反了约束，多半是外键约束";
        }
        return e.getMessage();
    }
}
