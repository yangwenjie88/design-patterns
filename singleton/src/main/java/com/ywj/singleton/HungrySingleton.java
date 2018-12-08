package com.ywj.singleton;

/**
 * @author Yang WenJie
 * @date 2018/12/8 下午12:49
 *  饿汉模式
 */
public final class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
