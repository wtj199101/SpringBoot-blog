package javaDir;

import java.lang.annotation.Annotation;

/**
 * Created by 42243 on 2017/8/8.
 */
@Customer
public class AnnotionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        String path="javaDir.AnnotionTest";
        Customer annotation = Class.forName(path).getAnnotation(Customer.class);
        System.out.println(annotation.name());
    }
}
