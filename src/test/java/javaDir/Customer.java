package javaDir;

import java.lang.annotation.*;

/**
 * Created by 42243 on 2017/8/8.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Customer {
    String name() default "zhsan";
    String value() default "aaa";

}
