package org.example.springframework;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * simple-spring
 *
 * @author: youl.li
 * @create: 2024-11-27 11:37
 */
/*
* 作用：实现Bean的注册和获取
* */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /*
    * 作用：注册BeanDefition
    * */
    public void registerBeanDefinition (String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

    /*
    * 作用：获取BeanDefition
    * */
    public Object getBean (String name) {
        if (beanDefinitionMap.containsKey(name)) {
            return beanDefinitionMap.get(name).getBean();
        }
        return null;
    }

}