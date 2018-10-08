package com.hk.bd.jiaohaokang20181008.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hk.bd.jiaohaokang20181008.R;

public class SeekView extends LinearLayout {
    public SeekView(Context context) {
        super(context);
        init(context);
    }

    public SeekView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public SeekView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    private void init(Context context) {
        View inflate = View.inflate(context, R.layout.seek_layout, null);
        addView(inflate);
    }
}
