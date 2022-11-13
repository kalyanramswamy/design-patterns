package com.designpattern.creational.singleton;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe singletonAdvanced;

    private SingletonThreadSafe(){}

    public static SingletonThreadSafe getInstance() {
        if(singletonAdvanced == null) {
            synchronized (SingletonThreadSafe.class){
                if(singletonAdvanced == null) {
                    singletonAdvanced = new SingletonThreadSafe();
                }
            }
        }
        return singletonAdvanced;
    }
}
