package com.ReplaceConstructorWithFactoryMethod.question.before;

public abstract class Printer {
    public static Printer create(boolean graphical) {
        if(graphical) {
            return new GraphPrinter();
        } else {
            return new DigitPrinter();
        }
    }

    public abstract void println(int n);
}
