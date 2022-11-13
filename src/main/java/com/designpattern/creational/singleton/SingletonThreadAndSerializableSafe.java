package com.designpattern.creational.singleton;

import java.io.Serializable;

public class SingletonThreadAndSerializableSafe implements Serializable {
    private static volatile SingletonThreadAndSerializableSafe singletonThreadAndSerializableSafe;

    private SingletonThreadAndSerializableSafe(){}

    public static SingletonThreadAndSerializableSafe getInstance() {
        if(singletonThreadAndSerializableSafe == null) {
            synchronized (SingletonThreadAndSerializableSafe.class) {
                if(singletonThreadAndSerializableSafe == null)
                    singletonThreadAndSerializableSafe = new SingletonThreadAndSerializableSafe();
            }
        }
        return singletonThreadAndSerializableSafe;
    }

    protected SingletonThreadAndSerializableSafe readResolve() {
        return getInstance();
    }
}
