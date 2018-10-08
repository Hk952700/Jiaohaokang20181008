package com.hk.bd.jiaohaokang20181008.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hk.bd.jiaohaokang20181008.R;

public class WaterView extends View{

    private float fai;
    private Paint paint;
    private Path path;

    public WaterView(Context context) {
        super(context);
        init(context,null);
    }

    public WaterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public WaterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attrs) {

        paint = new Paint();
        path = new Path();


        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.WaterView);
        int color = typedArray.getColor(R.styleable.WaterView_color, Color.parseColor("#ff0000"));
        paint.setColor(color);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        path.reset();


        path.moveTo(getLeft(),getBottom());

        double v = Math.PI * 2 / getWidth();
        fai-=0.1f;
        for (int i = 0; i <=getWidth() ; i+=20) {
            path.lineTo(i, (float) (10*Math.cos(v*i+fai)+20));
        }

        path.lineTo(getWidth(),getBottom());

        canvas.drawPath(path,paint);

        postInvalidateDelayed(20);


    }
}
