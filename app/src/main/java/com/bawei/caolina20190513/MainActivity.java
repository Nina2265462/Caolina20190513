package com.bawei.caolina20190513;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bawei.caolina20190513.base.BaseActivity;
import com.bawei.caolina20190513.mvp.HomeContanct;

/*
 *@Auther:cln
 *@Date: 2019-05-13
 *@Description:主界面
 * */
public class MainActivity extends BaseActivity implements HomeContanct.IHomeView {

    private ListView lv;

    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void bindView() {
        lv = findViewById(R.id.lv);
    }

    @Override
    protected void bindData() {

    }

    @Override
    protected void bindEvent() {

    }

    @Override
    public void ListShow() {
        
    }
}
