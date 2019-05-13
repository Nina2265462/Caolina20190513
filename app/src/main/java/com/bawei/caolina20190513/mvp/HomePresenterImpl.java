package com.bawei.caolina20190513.mvp;

import com.bawei.caolina20190513.net.CallBackPost;

/*
 *@Auther:cln
 *@Date: 时间
 *@Description:功能
 * */
public class HomePresenterImpl implements HomeContanct.IHomePresenter {

    private HomeContanct.IHomeView view;
    private HomeContanct.IHomeModel model;

    @Override
    public void attach(HomeContanct.IHomeView sview) {
        view = sview;
        model = new HomeModelImpl();
    }

    @Override
    public void dattach() {
    }

    @Override
    public void ListPresenter(String title, String image, CallBackPost post) {
        model.ListModel(title, image, new CallBackPost() {
            @Override
            public void onSuccess(String result) {
                view.ListShow();
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }
}
