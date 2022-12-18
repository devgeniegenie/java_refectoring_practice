package com.ReplaceTypeCodeWithStateStrategy.after2;

public class Logger {
    public enum State {
        STOPPED {
            @Override
            public void start() {
                System.out.println("** START LOGGING **");
            }
            @Override
            public void stop() {

            }
            @Override
            public void log(String info) {
                System.out.println("Ignoring: " + info);
            }
        },

        LOGGING {
            @Override
            public void start() {
            }
            @Override
            public void stop() {
                System.out.println("** STOP LOGGING **");
            }
            @Override
            public void log(String info) {
                System.out.println("LOGGING: " + info);
            }
        };

        public abstract void start();
        public abstract void stop();
        public abstract void log(String info);
    }
    private State _state;

    public Logger() {
        setState(State.STOPPED);
    }

    public void setState(State state) {
        _state = state;
    }

    public void start() {
        _state.start();
        setState(State.LOGGING);
    }

    public void stop() {
        _state.stop();
        setState(State.STOPPED);
    }

    public void log(String info) {
        _state.log(info);
    }
}
