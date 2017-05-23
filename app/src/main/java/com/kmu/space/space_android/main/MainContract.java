package com.kmu.space.space_android.main;

/**
 * Created by Null on 2017-05-23.
 */

public interface MainContract {
    interface View {
        void initView();
    }

    interface UserAction {
        void loginButtonClicked();
    }
}
