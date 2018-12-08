package com.ywj.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang WenJie
 * @date 2018/12/8 下午1:34
 */
public class ContainerSingleton {

    private static Map<String,Object> objectMap = new HashMap<>();

    private ContainerSingleton() {

    }

    public static void registerInstance(String key,Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key,instance);
        }
    }

    public static Object getInstance(String key) {
        return objectMap.get(key);
    }
}
