package com.learn.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 最简单的bean容器
 * @author cz
 * @date 2022/8/11
 **/
public class BeanFactory {

    private final Map<String, Object> beanMap = new HashMap<>(8);

    /**
     * bean注册
     * @param name bean名称
     * @param bean bean
     */
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    /**
     * 获取bean
     * @param name bean名称
     * @return bean
     */
    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
