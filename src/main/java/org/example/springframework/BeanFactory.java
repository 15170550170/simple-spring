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
public class BeanFactory {
    Map<String, BeanDefinition> beans = new ConcurrentHashMap<String, BeanDefinition>();


}