package com.ReplaceTypeCodeWithSubclasses.after2;

public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;
/*
    public static Shape createShape(int typecode, int startx, int starty, int endx, int endy) {
        switch (typecode) {
            case TYPECODE_LINE:
                return new ShapeLine(startx, starty, endx, endy);
            case TYPECODE_RECTANGLE:
                return new ShapeRectangle(startx, starty, endx, endy);
            case TYPECODE_OVAL:
                return new ShapeOval(startx, starty, endx, endy);
            default:
                throw new IllegalArgumentException("typecode = " + typecode);
        }
    }*/

    public static ShapeLine createShapeLine(int startx, int starty,int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static ShapeRectangle createShapeRectangle(int startx, int starty,int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static ShapeOval createShapeOval(int startx, int starty,int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }


    public Shape(int _startx, int _starty, int _endx, int _endy) {
        this._startx = _startx;
        this._starty = _starty;
        this._endx = _endx;
        this._endy = _endy;
    }

    public abstract int getTypecode();

    public abstract String getName();

    public abstract void draw();

    @Override
    public String toString() {
        return "[ " + getName() + ", "
                + "(" + _startx + ", " + _starty + ")-"
                + "(" + _endx + ", " + _endy + ") ]";
    }

}