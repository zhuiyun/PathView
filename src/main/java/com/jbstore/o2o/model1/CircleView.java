package com.jbstore.o2o.model1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gwy on 2017/6/29.
 */

public class CircleView extends View {
    private final int color;
    Paint paint;

    public CircleView(Context context) {
        this(context, null);
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray array=context.obtainStyledAttributes(attrs,R.styleable.CircleView);
        color=array.getColor(R.styleable.CircleView_circleColor,Color.BLACK);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        paint.setColor(color);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        final int left = getPaddingLeft();
        final int right = getPaddingRight();
        final int top = getPaddingTop();
        final int bottom = getPaddingBottom();
        int width = getWidth() - left - right;
        int height = getHeight() - top - bottom;

        int r = Math.min(width, height) / 2;
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, r, paint);
    }
}
