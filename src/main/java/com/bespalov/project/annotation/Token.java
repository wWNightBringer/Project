package com.bespalov.project.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Token {
    public boolean enable(String token) {
        return true;
    }
}
