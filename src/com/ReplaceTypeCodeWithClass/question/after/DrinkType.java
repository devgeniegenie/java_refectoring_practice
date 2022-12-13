package com.ReplaceTypeCodeWithClass.question.after;

public class DrinkType {
    public static final DrinkType COFFEE = new DrinkType("COFFEE");
    public static final DrinkType JUICE = new DrinkType("JUICE");
    public static final DrinkType TEA = new DrinkType("TEA");

    private final String _name;

    public DrinkType(String _name) {
        this._name = _name;
    }

    @Override
    public String toString() {
        return "DrinkType{" +
                "_name='" + _name + '\'' +
                '}';
    }
}
