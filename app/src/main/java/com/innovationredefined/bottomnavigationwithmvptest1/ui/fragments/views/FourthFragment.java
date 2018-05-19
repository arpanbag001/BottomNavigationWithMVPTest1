package com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.innovationredefined.bottomnavigationwithmvptest1.R;
import com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.presenter.FragmentPresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourthFragment extends Fragment {
    View fourthFragmentRootView;


    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fourthFragmentRootView = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = fourthFragmentRootView.findViewById(R.id.textview);
        FragmentPresenter fragmentPresenter = new FragmentPresenter(this);
        textView.setText(fragmentPresenter.getData());
        return fourthFragmentRootView;
    }

}
