package org.webpartners.meigic.sample.fragments;

import org.webpartners.meigic.sample.R;
import org.webpartners.meigic.sample.views.SampleFrame;
import org.webpartners.meigic.views.MeigicFragment;

import android.view.View;
import android.widget.LinearLayout;

/**
 * Project: Meigic sample
 * <p/>
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
 */
public class SampleFragment extends MeigicFragment<SampleFragmentPresenter> implements
        SampleFragmentPresenter.SampleFragmentView {


    @Override
    protected SampleFragmentPresenter initializePresenter() {
        return new SampleFragmentPresenter(this);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.sample_fragment_view;
    }

    @Override
    protected void initializeUI(View view) {
        ((LinearLayout) view).addView(new SampleFrame(getContext()));
    }
}
