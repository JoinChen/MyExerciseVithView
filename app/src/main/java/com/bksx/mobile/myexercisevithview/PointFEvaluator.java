package com.bksx.mobile.myexercisevithview;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import android.graphics.RectF;

public class PointFEvaluator implements TypeEvaluator<PointF> {
    PointF newPoint = new PointF();

    @Override
    public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
        float x = startValue.x + (fraction * (endValue.x - startValue.x));
        float y = startValue.y + (fraction * (endValue.y - startValue.y));

        newPoint.set(x, y);

        return newPoint;
    }
}
