package com.atwbin.mynicespinner;

import android.content.Context;

import java.util.List;

/**
 * @author Wbin
 * @title xxxxx.java
 * @project 千品猫商城
 * @date 2017/2/27 0027 15:25
 * @ copyright  Copyright © 2016 qpmall.com Inc. All Rights Reserved.
 * @description 系统名称：
 */
public class NiceSpinnerAdapter<T> extends NiceSpinnerBaseAdapter {

    private List<T> mItems;

    public NiceSpinnerAdapter(Context context, List<T> mItems, int textColor, int backgroundSelector) {
        super(context, textColor, backgroundSelector);
        this.mItems = mItems;
    }

    @Override
    public Object getItem(int position) {
        if (position >= mSelectedIndex) {
            return mItems.get(position + 1);
        } else {
            return mItems.get(position);
        }
    }

    @Override
    public int getCount() {
        return mItems.size() - 1;
    }

    @Override
    public Object getItemInDataset(int position) {
        return mItems.get(position);
    }
}
