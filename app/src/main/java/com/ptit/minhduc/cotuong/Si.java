package com.ptit.minhduc.cotuong;

import android.graphics.Bitmap;

/**
 * Created by DSU on 28/03/2018.
 */

public class Si implements QuanCo {

    private int x;
    private int y;
    private Bitmap bitmap;
    @Override
    public void move() {

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
this.x=x;
    }

    @Override
    public void setY(int y) {
this.y=y;
    }
}
