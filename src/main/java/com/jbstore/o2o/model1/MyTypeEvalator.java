package com.jbstore.o2o.model1;

import android.animation.TypeEvaluator;
import android.graphics.Point;


/**
 * Created by gwy on 2017/6/30.
 */

public class MyTypeEvalator implements TypeEvaluator {
    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        Point spoint= (Point) startValue;
        Point epPoint= (Point) endValue;
        int x= (int) (spoint.x);
        int y= (int) (spoint.y+fraction*(epPoint.y-spoint.y));
        return new Point(x,y);
    }
}
