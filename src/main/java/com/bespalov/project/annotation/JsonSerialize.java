package com.bespalov.project.annotation;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface JsonSerialize {
}
