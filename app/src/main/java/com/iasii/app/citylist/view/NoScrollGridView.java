package com.iasii.app.citylist.view;

import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by next on 2016/3/24.
 */
public class NoScrollGridView extends GridView {

    public NoScrollGridView(android.content.Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 设置不滚动
     */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
