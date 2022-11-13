package com.designpattern.creational.singleton;

import java.io.Serializable;

public class SingletonThreadAndSerializableAndRefractionSafe implements Serializable {
    private static volatile SingletonThreadAndSerializableAndRefractionSafe singleton;

    private SingletonThreadAndSerializableAndRefractionSafe() {
        if(singleton != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static SingletonThreadAndSerializableAndRefractionSafe getInstance() {
        if(singleton == null) {
            synchronized (SingletonThreadAndSerializableAndRefractionSafe.class) {
                if(singleton == null) {
                    singleton = new SingletonThreadAndSerializableAndRefractionSafe();
                }
            }
        }
        return singleton;
    }

    protected SingletonThreadAndSerializableAndRefractionSafe readResolve() {
        return getInstance();
    }
}