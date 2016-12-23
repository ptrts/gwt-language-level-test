package me.server;

import me.gwt.shared.Runner;

public class ServerClass {
    
    public void foo() {
        Runner.run(() -> {
            System.out.println(1);
            System.out.println(2);
        });
    }
}
