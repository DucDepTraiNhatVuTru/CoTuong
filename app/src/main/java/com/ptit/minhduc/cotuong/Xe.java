package com.ptit.minhduc.cotuong;

import android.graphics.Bitmap;

/**
 * Created by DSU on 28/03/2018.
 */

public class Xe implements QuanCo {
    private int x;
    private int y;
    private Bitmap bitmap;
    public void move(){}

    public Xe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
