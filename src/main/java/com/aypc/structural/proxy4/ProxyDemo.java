package com.aypc.structural.proxy4;

public class ProxyDemo {

    public static void main(String[] args) {
        UserService cachingProxy = new CachingUserServiceProxy(new UserServiceImpl());
        cachingProxy.getUsers("us");
        cachingProxy.getUsers("us");
        cachingProxy.getUsers("en");
        cachingProxy.getUsers("en");
        System.out.println("Access count: " + cachingProxy.getAccessCount());
    }
}
