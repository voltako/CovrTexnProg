package org.edu;

public class MegaThread implements Runnable {

    public void run() {
        Variable variable = new Variable();
        variable.setVariable("test");
        System.out.println("установленно новое значение");
        System.out.println(variable.getVariable());

    }
}
