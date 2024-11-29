package org.example.springframework;

/*
* 作用：实现Bean的定义
* */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition (Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
