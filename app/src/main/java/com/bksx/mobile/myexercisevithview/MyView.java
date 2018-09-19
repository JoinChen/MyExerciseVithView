package com.bksx.mobile.myexercisevithview;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LightingColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class MyView extends View {
    float progress = 0;
    Paint mPaint = new Paint();
    Path path = new Path();
    Context mContext;


    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setColor(Color.parseColor("#65ff00"));
//        mPaint.setAntiAlias(true);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(20);
//        canvas.drawCircle(50,50,20,mPaint);
//        init();
//        drawBeziercurve();
//        drawLine();
//        drawArc(canvas);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            drawRing(canvas);
//        }
//        canvas.drawPath(path, mPaint);
//        drawMyText(canvas);
//        clip(canvas);
        drawWithObjAnimator(canvas);
//        drawCircleWithEvaluator(canvas);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void init() {
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
    }

    private void drawLine() {
        path.lineTo(100, 100);
        path.rLineTo(20, 200);
    }

    /*贝塞尔曲线*/
    private void drawBeziercurve() {
        path.quadTo(50, 50, 300, 300);
    }

    /*扇形、圆弧*/
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void drawArc(Canvas canvas) {
        //一部分扇形
        path.moveTo(350, 125);
        path.lineTo(350, 20);
        path.arcTo(100, 20, 600, 230, -90, 120, false);
        path.close();
        canvas.drawPath(path, mPaint);

        mPaint.setColor(Color.parseColor("#ffffff"));
        mPaint.setTextSize(40);
        canvas.drawText("I", 480, 73, mPaint);

        mPaint.setColor(Color.parseColor("#ff0000"));
        canvas.drawArc(100, 20, 600, 230, 30, 80, true, mPaint);

        mPaint.setColor(Color.parseColor("#ffffff"));
        mPaint.setTextSize(40);
        canvas.drawText("WILL", 350, 200, mPaint);

        mPaint.setColor(Color.parseColor("#000000"));
        canvas.drawArc(100, 20, 600, 230, 110, 10, true, mPaint);
        mPaint.setColor(Color.parseColor("#0000ff"));
        canvas.drawArc(100, 20, 600, 230, 120, 120, true, mPaint);

        mPaint.setColor(Color.parseColor("#ffffff"));
        mPaint.setTextSize(40);
        canvas.drawText("LOVE", 125, 130, mPaint);

        mPaint.setColor(Color.parseColor("#987dda"));
        canvas.drawArc(100, 20, 600, 230, 240, 30, true, mPaint);

        mPaint.setColor(Color.parseColor("#ffffff"));
        mPaint.setTextSize(40);
        canvas.drawText("YOU", 265, 70, mPaint);
//        canvas.drawArc(100,20,600,230,-120,20,true,mPaint);

    }

    Bitmap bitmap;

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void drawRing(Canvas canvas) {
//        Shader shader = new LinearGradient(50,250,450,250,Color.parseColor("#E91E63"),
//                Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);
        //辐射渐变色 radius是进行重复着色的半径区域
//        Shader shader = new RadialGradient(500,500,250,Color.parseColor("#E91E63"),
//                Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);
//        mPaint.setShader(shader);
        //扫描渐变色
//        Shader shader = new SweepGradient(50,500,Color.parseColor("#E91E63"),
//                Color.parseColor("#2196F3"));
//        mPaint.setShader(shader);
        //bitmap着色
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.banner1);
//        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
//        mPaint.setShader(shader);
//        canvas.drawBitmap(bitmap,0,0,mPaint);
//        canvas.drawCircle(200,200,200,mPaint);
//        ColorFilter lightingColorFilter = new LightingColorFilter(0xffffff, 0x003000);
//        mPaint.setColorFilter(lightingColorFilter);

//        canvas.drawCircle(getWidth()/4,getHeight()/6,200,mPaint);
        RectF rectF = new RectF(0, 0, getWidth() / 2, getHeight() / 3);   //w和h分别是屏幕的宽和高，也就是你想让图片显示的宽和高
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.banner1, options);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint.setShader(shader);

        ColorFilter lightingColorFilter = new LightingColorFilter(0xffffff, 0x003000);
        mPaint.setColorFilter(lightingColorFilter);

        canvas.drawCircle(getWidth() / 4, getHeight() / 6, getWidth() / 5, mPaint);

//        canvas.drawBitmap(bitmap, null, rectF, mPaint);
//        canvas.drawBitmap(bitmap1,0,0,mPaint);


//        path.addCircle(500,500,450, Path.Direction.CW);
//        path.addCircle(500,500,20, Path.Direction.CCW);
//        path.setFillType(Path.FillType.WINDING);
    }

    private void drawMyText(Canvas canvas) {
        path.moveTo(100, 100);
        path.lineTo(150, 100);
        path.lineTo(230, 50);
        path.lineTo(450, 150);
        path.lineTo(698, 35);
        PathEffect pathEffect = new CornerPathEffect(20);
        mPaint.setPathEffect(pathEffect);
        canvas.drawPath(path, mPaint);
        mPaint.setTextSize(50);
        mPaint.setStrokeWidth(0);
        canvas.drawTextOnPath("what's the fucking hell!", path, 0, 15, mPaint);
    }

    private void clip(Canvas canvas) {
//        RectF rectF = new RectF(0, 0, getWidth() / 2, getHeight() / 3);   //w和h分别是屏幕的宽和高，也就是你想让图片显示的宽和高
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inScaled = false;
//        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
//        canvas.save();
//        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.banner1);
//        canvas.clipRect(100,100,700,400);
//        canvas.drawBitmap(bitmap2, 0, 0, mPaint);
//        canvas.restore();

//        canvas.save();
//        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.banner1);
//        path.addCircle(100,100,80, Path.Direction.CW);
//        canvas.clipPath(path);
//        canvas.drawBitmap(bitmap2,0,0,mPaint);

//        canvas.save();
//        canvas.clipRect(50,0,getWidth() / 2,getHeight() / 4);
//        canvas.drawBitmap(bitmap2,null,rectF,mPaint);
//        canvas.restore();

        canvas.save();
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.banner1);
//        canvas.skew(1f,0f);
        canvas.scale(0.5f,0.5f,500,200);
//        canvas.rotate(30,100,0);
        canvas.translate(-200, 0);
        canvas.drawBitmap(bitmap2, 0, 0, mPaint);
        canvas.restore();
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
        invalidate();
    }

    private void drawWithObjAnimator(Canvas canvas){
        RectF srcRef = new RectF(20,20,500,500);
        canvas.drawArc(srcRef,125,progress,false,mPaint);
        mPaint.setStrokeWidth(0);
        mPaint.setTextSize(50);
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setColor(Color.parseColor("#00ff00"));
        canvas.drawText(Math.round(progress/3.6)+"%",260,260,mPaint);
    }

    private void drawCircleWithEvaluator(Canvas canvas){
        mPaint.setColor(Color.parseColor("#00ff00"));
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(50,50,20,mPaint);

    }
}
