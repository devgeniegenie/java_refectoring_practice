package com.ReplaceConstructorWithFactoryMethod.after2;

public class ShapeLine extends Shape{
    public ShapeLine(int _startx, int _starty, int _endx, int _endy) {
        super(_startx, _starty, _endx, _endy);
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }
}
