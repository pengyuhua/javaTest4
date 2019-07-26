package com.hand.pyh.annotation;


import com.hand.pyh.bean.Page;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConvertPage {

    String value() default "page";
}
