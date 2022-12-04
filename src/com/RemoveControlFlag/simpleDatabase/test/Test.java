package com.RemoveControlFlag.simpleDatabase.test;

import java.awt.*;

public class Test {
    Point[] _point;

    public boolean existPoint(int x, int y) {
        boolean f = false;
        boolean ff = false;

        for(int i = 0; !(f && ff) && i < _point.length; i++){
            if(_point[i].x == x) {
                f = true;
            } else {
                f = false;
            }

            if(_point[i].y == y) {
                ff = true;
            } else {
                ff = false;
            }
        }
        boolean fff = false;
        if(f && ff) {
            fff = true;
        } else {
            fff = false;
        }
        return fff;
    }
}
