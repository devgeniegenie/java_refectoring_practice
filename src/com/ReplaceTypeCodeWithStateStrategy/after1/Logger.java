package com.ReplaceTypeCodeWithStateStrategy.after1;

public class Logger {
    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;
    private State _state;

    public Logger() {
        setState(STATE_STOPPED);
    }

    public int getState() {
        return _state.getTypecode();
    }

    public void setState(int state) {
        switch (state) {
            case STATE_STOPPED:
                _state = new StateStoped();
                break;
            case STATE_LOGGING:
                _state = new StateLogging();
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }

    public void start() {
        switch (getState()) {
            case STATE_STOPPED:
                System.out.println("** START LOGGING **");
                setState(STATE_LOGGING);
                break;
            case STATE_LOGGING:
                break;
            default:
                System.out.println("Invalid state: " + getState());
        }
    }

    public void stop() {
        switch (getState()) {
            case STATE_STOPPED:
                break;
            case STATE_LOGGING:
                System.out.println("** STOP LOGGING **");
                setState(STATE_STOPPED);
                break;
            default:
                System.out.println("Invalid state: " + getState());
        }
    }

    public void log(String info) {
        switch (getState()) {
            case STATE_STOPPED:
                System.out.println("Ignoring: " + info);
                break;
            case STATE_LOGGING:
                System.out.println("LOGGING: " + info);
                break;
            default:
                System.out.println("Invalid state: " + getState());
        }
    }
}
