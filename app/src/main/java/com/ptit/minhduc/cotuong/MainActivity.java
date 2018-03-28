package com.ptit.minhduc.cotuong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgBoard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBoard=findViewById(R.id.imgBanCo);

        ChessBoard chessBoard= new ChessBoard(MainActivity.this,300,300);
        chessBoard.init();

        imgBoard.setImageBitmap(chessBoard.drawBoard());
    }
}
