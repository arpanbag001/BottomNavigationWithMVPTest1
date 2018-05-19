package com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.presenter;

import android.support.v4.app.Fragment;

public interface FragmentPresenter {
    void subscribe(Fragment fragment);

    void unsubscribe();
}
