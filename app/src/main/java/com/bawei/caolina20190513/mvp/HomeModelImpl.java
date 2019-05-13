package com.bawei.caolina20190513.mvp;

import com.bawei.caolina20190513.net.CallBackPost;
import com.bawei.caolina20190513.net.HttpUtil;

/*
 *@Auther:cln
 *@Date: 时间
 *@Description:功能
 * */
public class HomeModelImpl implements HomeContanct.IHomeModel {

    private final HttpUtil httpUtil;

    public HomeModelImpl() {
        httpUtil = HttpUtil.getInstance();
    }

    @Override
    public void ListModel(String title, String image, CallBackPost post) {
        String str ="https://code.aliyun.com/598254259/FristProject/raw/master/bw_list.txt\n";
        httpUtil.doHttpGet(str, new CallBackPost() {
            @Override
            public void onSuccess(String result) {

            }

            @Override
            public void onFail(String msg) {

            }
        });
    }
}
