package com.bawei.caolina20190513.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.caolina20190513.R;

/*
 *@Auther:cln
 *@Date: 2019-05-13
 *@Description:基类
 * */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        bindView();
        bindData();
        bindEvent();
    }

    protected abstract int bindLayout();

    protected abstract void bindView();

    protected abstract void bindData();

    protected abstract void bindEvent();
}
