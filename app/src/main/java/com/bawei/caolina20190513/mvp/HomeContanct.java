package com.bawei.caolina20190513.mvp;

import com.bawei.caolina20190513.net.CallBackPost;

/*
 *@Auther:cln
 *@Date: 时间
 *@Description:功能
 * */
public interface HomeContanct {
    public interface IHomeModel {
        void ListModel(String title, String image,CallBackPost post);
    }

    public interface IHomeView {
        void ListShow();
    }

    public interface IHomePresenter {
        void attach(IHomeView sview);

        void dattach();

        void ListPresenter(String title, String image, CallBackPost post);
    }
}
