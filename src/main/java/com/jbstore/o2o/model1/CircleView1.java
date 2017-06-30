package com.jbstore.o2o.model1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gwy on 2017/6/30.
 */

public class CircleView1 extends View {
    Paint paint;
    Point cPoint;
    int r = 100;

    public CircleView1(Context context) {
        this(context, null);
    }

    public CircleView1(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (cPoint == null) {
            cPoint = new Point(r, r);

            canvas.drawCircle(cPoint.x, cPoint.y, 100, paint);
            Point sPoint = new Point(r, r);
            Point ePoint = new Point(500,12000);
            ValueAnimator animator = ValueAnimator.ofObject(new MyTypeEvalator(), sPoint, ePoint);
            animator.setDuration(10000);
            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    cPoint = (Point) animation.getAnimatedValue();

                    invalidate();
                }
            });
            animator.start();

        } else {
            canvas.drawCircle(cPoint.x, cPoint.y, 100, paint);
        }


    }
}
