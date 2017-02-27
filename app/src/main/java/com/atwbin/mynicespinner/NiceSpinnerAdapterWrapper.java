package com.atwbin.mynicespinner;

import android.content.Context;
import android.widget.ListAdapter;

/**
 * @author Wbin
 * @title xxxxx.java
 * @project 千品猫商城
 * @date 2017/2/27 0027 15:29
 * @ copyright  Copyright © 2016 qpmall.com Inc. All Rights Reserved.
 * @description 系统名称：
 */
public class NiceSpinnerAdapterWrapper extends NiceSpinnerBaseAdapter {

    private final ListAdapter mListAdapter;

    public NiceSpinnerAdapterWrapper(Context context, ListAdapter mListAdapter, int textColor, int backgroundSelector) {
        super(context, textColor, backgroundSelector);
        this.mListAdapter = mListAdapter;
    }

    @Override
    public Object getItem(int position) {
        if (position >= mSelectedIndex) {
            return mListAdapter.getItem(position + 1);
        } else {
            return mListAdapter.getItem(position);
        }
    }

    @Override
    public int getCount() {
        return mListAdapter.getCount() - 1;
    }

    @Override
    public Object getItemInDataset(int position) {
        return mListAdapter.getItem(position);
    }
}
