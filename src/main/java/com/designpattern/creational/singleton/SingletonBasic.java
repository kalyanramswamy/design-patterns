package com.designpattern.creational.singleton;

public class SingletonBasic {
    private static SingletonBasic singleton;

    private SingletonBasic() {
    }

    public static SingletonBasic getInstance() {
        if(singleton == null) {
            singleton = new SingletonBasic();
        }
        return singleton;
    }
}
