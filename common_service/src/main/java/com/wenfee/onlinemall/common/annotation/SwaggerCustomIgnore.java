package com.wenfee.onlinemall.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Mr.Wenfee
 * @create: 2021-05-15 17:16
 * <p>
 * 忽略接口注解
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SwaggerCustomIgnore {
}
