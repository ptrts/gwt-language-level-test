package me.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import me.gwt.shared.Runner;

public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Runner.run(() -> {
            GWT.log("1");
            GWT.log("2");
        });
    }
}
