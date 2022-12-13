package com.ReplaceTypeCodeWithClass.question.after;

public class LunchType {
    public static final LunchType A = new LunchType("A");
    public static final LunchType B = new LunchType("B");
    public static final LunchType C = new LunchType("C");

    private final String _name;

    public LunchType(String _name) {
        this._name = _name;
    }

    @Override
    public String toString() {
        return "LunchType{" +
                "_name='" + _name + '\'' +
                '}';
    }
}
