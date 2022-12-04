package com.RemoveControlFlag.simpleDatabase.test;

import java.awt.*;

public class MySolution {
    Point[] _point;

    public boolean existPoint(int x, int y) {
        for (Point point : _point) {
            if(point.x == x && point.y == y) return true;
        }
        return false;
    }
}
