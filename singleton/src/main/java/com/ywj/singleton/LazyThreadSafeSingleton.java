package com.ywj.singleton;

/**
 * @author Yang WenJie
 * @date 2018/12/8 下午1:03
 */
public class LazyThreadSafeSingleton {

    private static LazyThreadSafeSingleton singleton;

    private LazyThreadSafeSingleton() {

    }

    public synchronized static LazyThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyThreadSafeSingleton();
        }
        return singleton;
    }
}
