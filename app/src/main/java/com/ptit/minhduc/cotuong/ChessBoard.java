package com.ptit.minhduc.cotuong;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.List;

/**
 * Created by DSU on 28/03/2018.
 */

public class ChessBoard {
    private Paint paint;
    private Canvas canvas;
    private Bitmap bitmap;
    private Context context;
    private List<Line> lines;
    private int bitmapWidth , bitmapHeight;

    public ChessBoard(Context context, int bitmapWidth, int bitmapHeight) {
        this.context = context;
        this.bitmapWidth = bitmapWidth;
        this.bitmapHeight = bitmapHeight;
    }

    public void init(){
        bitmap = Bitmap.createBitmap(bitmapWidth,bitmapHeight,Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint = new Paint();
        paint.setStrokeWidth(2);

        int cellHeight= bitmapHeight/10;
        int cellWidth= bitmapWidth/9;
        for (int i=0;i<10;i++){
            lines.add(new Line(0,i*cellHeight,bitmapWidth,i*cellHeight));
        }
        lines.add(new Line(0,0,0,bitmapHeight));
        lines.add(new Line(bitmapWidth,0, bitmapWidth,bitmapHeight));

        for (int i =1;i<8;i++){
            lines.add(new Line(cellWidth*i,0,cellWidth*i,4*cellHeight));

            lines.add(new Line(cellWidth*i,5*cellHeight,cellWidth*i,bitmapHeight));
        }

        lines.add(new Line(3*cellWidth,0,5*cellWidth,2*cellHeight));
        lines.add(new Line(3*cellWidth,2*cellHeight,5*cellWidth,0));

        lines.add(new Line(cellWidth*3,bitmapHeight,5*cellWidth,7*cellHeight));
        lines.add(new Line(3*cellWidth,7*cellHeight,5*cellWidth,bitmapHeight));
        //lines.add(new Line(0,0,))
    }

    public  Bitmap drawBoard(){
        for (int i=0;i<lines.size();i++){
            canvas.drawLine(lines.get(i).getStartX(),lines.get(i).getStartY(),lines.get(i).getStopX(),lines.get(i).getStopY(),paint);
        }
        return bitmap;
    }
}
