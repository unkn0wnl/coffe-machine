package com.innowise.coffeemachine.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Log4j2
@Component
public class RequestLoggerInterceptor implements AsyncHandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestString = StreamSupport.stream(
                ((Iterable<String>) () -> request.getParameterNames().asIterator()).spliterator(), false)
                .map(paramName -> paramName.concat("=").concat(request.getParameter(paramName)))
                .collect(Collectors.joining("&"));
        log.debug("Method: [preHandle] Request: {}", requestString);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("Method: [preHandle] Request: {}", request.getParameterNames());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
