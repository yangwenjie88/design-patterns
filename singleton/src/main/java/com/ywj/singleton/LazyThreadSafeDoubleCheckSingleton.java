package com.ywj.singleton;

/**
 * @author Yang WenJie
 * @date 2018/12/8 下午1:05
 */
public class LazyThreadSafeDoubleCheckSingleton {

    private volatile static LazyThreadSafeDoubleCheckSingleton singleton;

    private LazyThreadSafeDoubleCheckSingleton() {

    }


    public static LazyThreadSafeDoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyThreadSafeDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyThreadSafeDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
