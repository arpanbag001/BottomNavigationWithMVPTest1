package com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.presenter;

import android.support.v4.app.Fragment;

import com.innovationredefined.bottomnavigationwithmvptest1.data.models.DataProvider;
import com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.views.FirstFragment;
import com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.views.FourthFragment;
import com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.views.SecondFragment;
import com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.views.ThirdFragment;


public class FragmentPresenter {

    private Fragment fragment;

    public FragmentPresenter(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getData() {
        String key = getKeyAccordingToFragment(fragment);
        DataProvider dataProvider = new DataProvider();
        return dataProvider.getData(key);
    }

    private String getKeyAccordingToFragment(Fragment fragment) {
        if (fragment instanceof FirstFragment)
            return "Home";
        else if (fragment instanceof SecondFragment)
            return "Search";
        else if (fragment instanceof ThirdFragment)
            return "Profile";
        else if (fragment instanceof FourthFragment)
            return "Browse";
        else return null;
    }

}
