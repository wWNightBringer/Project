package com.bespalov.project.annotation;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Configuration
@RequiredArgsConstructor
public class TokenAspect {
    private final Token token;

    @Before("@annotation(JsonSerialize) &&  args(httpServletRequest,..)")
    public void before(HttpServletRequest httpServletRequest) {
        if (!(httpServletRequest instanceof HttpServletRequest)) {
            throw new RuntimeException("Request should be httpServletRequest");
        }
        if (token.enable(httpServletRequest.getHeader("Authorize"))) {
            httpServletRequest.setAttribute("userSession", "Session information can be access in controller");
        } else {
            throw new RuntimeException("auth error...");
        }
    }
}
