package com.ywj.singleton;

/**
 * @author Yang WenJie
 * @date 2018/12/8 下午1:27
 */
public class InternalClassSingleton {

    private InternalClassSingleton() {
    }

    private static class SingletonHolder {
        private static InternalClassSingleton singleton = new InternalClassSingleton();
    }

    public static InternalClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }
}
