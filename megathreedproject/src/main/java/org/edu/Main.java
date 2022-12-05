package org.edu;

public class Main {

    static MegaThread megaThread;
    public static void main(String[] args) {


        megaThread = new MegaThread();
        Thread thread1 = new Thread(megaThread);
        thread1.start();
        Thread thread2 = new Thread(megaThread);
        thread2.start();
        Thread thread3 = new Thread(megaThread);
        thread3.start();

    }

}