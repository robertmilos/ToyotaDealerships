package com.client;

public class Start implements Runnable{
    public void run(){
        Login.start();
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Start());
        t.start();
    }
}
