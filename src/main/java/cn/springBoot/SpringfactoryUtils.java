package cn.springBoot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public  class SpringfactoryUtils implements BeanFactoryAware{
private static BeanFactory beanFactory;
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }
    public static<T> T getBean(String beanName){
        if(null!=beanFactory){
            return (T) beanFactory.getBean(beanName);
        }
        return null;
    }
}
