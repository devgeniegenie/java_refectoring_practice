package com.ReplaceTypeCodeWithStateStrategy.after1;

public class StateStoped extends State {
    @Override
    public int getTypecode() {
        return Logger.STATE_STOPPED;
    }
}
