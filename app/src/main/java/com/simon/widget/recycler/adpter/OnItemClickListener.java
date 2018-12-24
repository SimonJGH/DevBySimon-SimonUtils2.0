package com.simon.widget.recycler.adpter;

import android.view.View;

/**
 * Created by Simon on 2017/9/19.
 */

public interface OnItemClickListener {

    void setOnItemClickListener(View view, int position);

    void setOnItemLongClickListener(View view, int position);
}
