package com.IntroduceNullObject.after1;

public class NullLabel extends Label {
    public NullLabel() {
        super("(none)");
    }
    @Override
    public void display() {

    }

    @Override
    public boolean isNull() {
        return true;
    }

}
