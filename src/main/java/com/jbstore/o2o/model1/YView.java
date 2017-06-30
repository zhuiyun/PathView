package com.jbstore.o2o.model1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gwy on 2017/6/30.
 */

public class YView extends View {
    Path linePath;
    Paint lpaint;
    Paint cpaint;
    Point cPoint;
    int r = 300;

    public YView(Context context) {
        this(context, null);
    }

    public YView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public YView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initPaint();
    }

    private void initPaint() {
        lpaint = new Paint();
        lpaint.setColor(Color.DKGRAY);
        lpaint.setAntiAlias(true);
        lpaint.setStrokeWidth(10);
        lpaint.setStyle(Paint.Style.STROKE);
        cpaint = new Paint();
        cpaint.setStyle(Paint.Style.FILL_AND_STROKE);
        cpaint.setColor(Color.GRAY);
        linePath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(400, 500);
        if (cPoint == null) {
            cPoint = new Point(r, r);
//            canvas.drawCircle(cPoint.x, cPoint.y, r, cpaint);
            linePath.moveTo(cPoint.x - r, cPoint.y);
            linePath.cubicTo(cPoint.x - r, cPoint.y, cPoint.x, cPoint.y + r, cPoint.x + r, cPoint.y);
            canvas.drawPath(linePath, lpaint);
            ValueAnimator valueAnimator = ValueAnimator.ofObject(new MyTypeEvalator(), new Point(cPoint.x, 100), new Point(cPoint.x, 500));
            valueAnimator.setDuration(10000);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    cPoint = (Point) animation.getAnimatedValue();
                    linePath.rewind();
                    invalidate();
                }
            });
            valueAnimator.start();

        } else {

            linePath.moveTo(cPoint.x - r, 300);
            linePath.cubicTo(cPoint.x - r, 300, cPoint.x, cPoint.y + r, cPoint.x + r, 300);
            canvas.drawPath(linePath, lpaint);
        }
    }
}
