package com.bksx.mobile.myexercisevithview;

import android.animation.TypeEvaluator;
import android.graphics.Color;

public class HsvEvaluator implements TypeEvaluator<Integer> {
    float[] startHsv = new float[3];
    float[] endHsv = new float[3];
    float[] outHsv = new float[3];

    @Override
    public Integer evaluate(float v, Integer integer, Integer t1) {
        //第一步把argb颜色值转换成hsv
        Color.colorToHSV(integer,startHsv);
        Color.colorToHSV(t1,endHsv);
        //当前百分比所对应的透明度
        if (endHsv[0] - startHsv[0] > 180) {
            endHsv[0] -= 360;
        } else if (endHsv[0] - startHsv[0] < -180) {
            endHsv[0] += 360;
        }
        outHsv[0] = startHsv[0] + (endHsv[0] - startHsv[0]) * v;
        if (outHsv[0] > 360) {
            outHsv[0] -= 360;
        } else if (outHsv[0] < 0) {
            outHsv[0] += 360;
        }
        outHsv[1] = startHsv[1] + (endHsv[1] - startHsv[1]) * v;
        outHsv[2] = startHsv[2] + (endHsv[2] - startHsv[2]) * v;

        //再将HSV格式转换成ARGB
        int finalOutHsv = Color.HSVToColor(outHsv);
        return finalOutHsv;
    }
}
