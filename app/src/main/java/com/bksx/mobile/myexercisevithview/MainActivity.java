package com.bksx.mobile.myexercisevithview;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyView view = findViewById(R.id.view_myview);
//        ImageView imageView = findViewById(R.id.iv_test);
//        ImageView imageView = findViewById(R.id.iv_banner);
        //viewPropertyAnimator
//        view.animate()
//                .translationY(200)
//                .translationX(50)
//                .scaleX(1.5f)
//                .scaleY(1.5f)
//                .rotationX(10)
//                .rotationY(-20)
//                .alpha(0.1f)
//                .setDuration(3000);

        //objectAnimator
//        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view,"translationY",65);
//        objectAnimator.setDuration(4000);
//        objectAnimator.start();
        //设置加载进度圆环+百分数字
//        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view,"progress",0,360);
//        animator1.setDuration(5000);
//        animator1.setInterpolator(new AccelerateInterpolator());
//        animator1.start();
        //结合贝塞尔路线动画
//        Path path = new Path();
//        path.quadTo(300,0,600,800);
//        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view,"x","y",path);
//        objectAnimator.setDuration(3000);
//        objectAnimator.setRepeatCount(-1);
//        objectAnimator.start();
        //利用Evaluator设置颜色的渐变效果
//        int color1 = Color.parseColor("#00ff00");
//        int color2 = Color.parseColor("#ff0000");
//        ObjectAnimator animator = ObjectAnimator.ofInt(imageView, "backgroundResource", R.drawable.b_canjiadepeixun,R.drawable.banner1);
//        animator.setEvaluator(new ArgbEvaluator());
//        animator.setRepeatCount(-1);
//        animator.setDuration(1000);
//        animator.start();
        //利用自定义的HSVEvaluator
//        int color1 = Color.parseColor("#00ff00");
//        int color2 = Color.parseColor("#ff0000");
//        ObjectAnimator animator = ObjectAnimator.ofInt(imageView, "backgroundColor", 0xff00ff00,0xffff0000);
//        animator.setEvaluator(new HsvEvaluator());
//        animator.setRepeatCount(-1);
//        animator.setDuration(5000);
//        animator.start();
        //自定义PointEvaluator-未生效
//        ObjectAnimator animator = ObjectAnimator.ofObject(imageView, "position",
//                new PointFEvaluator(), new PointF(50, 50), new PointF(500, 500));
//        animator.start();
        //使用objectAnimator时多项操作同时进行
//        AnimatorSet animatorSet = new AnimatorSet();
////        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view,"scaleX",2);
////        animator1.setDuration(3000);
////        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view,"translationX",800);
////        animator1.setInterpolator(new AccelerateDecelerateInterpolator());
////
////        animatorSet.playSequentially(animator1,animator2);
////        animatorSet.start();
//        PropertyValuesHolder holder1 = PropertyValuesHolder.ofFloat("scaleX", 1,0.5f);
//        PropertyValuesHolder holder2 = PropertyValuesHolder.ofFloat("scaleY", 1,0.5f);
//        PropertyValuesHolder holder3 = PropertyValuesHolder.ofFloat("alpha", 0,1);
//
//        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(view, holder1, holder2, holder3);
//        animator.start();
        //利用propertyvalueholder实现进度加载并倒退
        // 在 0% 处开始
//        Keyframe keyframe1 = Keyframe.ofFloat(0, 0);
//        // 时间经过 50% 的时候，动画完成度 100%
//        Keyframe keyframe2 = Keyframe.ofFloat(0.5f, 360);
//        // 时间见过 100% 的时候，动画完成度倒退到 80%，即反弹 20%
//        Keyframe keyframe3 = Keyframe.ofFloat(1, 270);
//        PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe1, keyframe2, keyframe3);
//
//        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(view, holder);
//        animator.setDuration(5000);
//        animator.start();


    }
}
