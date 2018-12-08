package com.ywj.singleton;

/**
 * @author Yang WenJie
 * @date 2018/12/8 下午12:56
 * 懒汉模式（线程不安全)）
 */
public class LazyThreadUnSafeSingleton {

    private static LazyThreadUnSafeSingleton singleton;

    private LazyThreadUnSafeSingleton() {
    }

    public static LazyThreadUnSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyThreadUnSafeSingleton();
        }
        return singleton;
    }
}
