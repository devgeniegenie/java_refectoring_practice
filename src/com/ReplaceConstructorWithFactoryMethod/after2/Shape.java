package com.ReplaceConstructorWithFactoryMethod.after2;

public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public static Shape createLine(int startx, int starty, int _endx, int _endy) {
        return new ShapeLine(startx, starty, _endx, _endy);
    }
    public static Shape createRectangle(int startx, int starty, int _endx, int _endy) {
        return new ShapeRectangle(startx, starty, _endx, _endy);
    }
    public static Shape craeteOval(int startx, int starty, int _endx, int _endy) {
        return new ShapeOval(startx, starty, _endx, _endy);
    }

    protected Shape(int _startx, int _starty, int _endx, int _endy) {
        this._startx = _startx;
        this._starty = _starty;
        this._endx = _endx;
        this._endy = _endy;
    }

    public String toString() {
        return "["
                + getName() + ", "
                + "(" + _startx + ", " + _starty + ")-"
                + "(" + _endx + ", " + _endy + ") ]";
    }

    public abstract String getName();

    public abstract void draw();
}
