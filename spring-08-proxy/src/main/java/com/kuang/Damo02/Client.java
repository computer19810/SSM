package com.kuang.Damo02;

public class Client {
    public static void main(String[] args) {
        Host host=new Host();

        ProxyInvocationHandler phi=new ProxyInvocationHandler();
        phi.setRent(host);
        Rent proxy = (Rent) phi.getProxy();
        proxy.rent();//zhuzhuzhuloooooooooooooooooo????????????? 这叫淘气~~

    }
}
