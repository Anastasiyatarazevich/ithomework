package com.example.smt;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

    public class MyView extends View {


        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            int y = 0;
            while (y < canvas.getHeight()) {
                canvas.drawLine(0, y,
                        this.getWidth(), y, paint);
                y += 30;
            }

        }


        public MyView(Context context) {
            super(context);
        }
    }

