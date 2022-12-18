package com.ReplaceTypeCodeWithStateStrategy.after1;

public class StateLogging extends State{

    @Override
    public int getTypecode() {
        return Logger.STATE_LOGGING;
    }
}
