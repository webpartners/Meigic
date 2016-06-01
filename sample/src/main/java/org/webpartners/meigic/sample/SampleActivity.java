package org.webpartners.meigic.sample;

import org.webpartners.meigic.sample.fragments.SampleFragment;
import org.webpartners.meigic.views.MeigicActivity;

import android.support.v4.app.FragmentTransaction;

/**
 * Project: Meigic sample
 * <p>
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
 */
public class SampleActivity extends MeigicActivity<SampleActivityPresenter> implements
        SampleActivityPresenter.SampleActivityView {


    @Override
    protected SampleActivityPresenter initializePresenter() {
        return new SampleActivityPresenter(this);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.sample_activity_view;
    }

    @Override
    protected void initializeUI() {
        String sample_fragment = "sample_fragment";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_placeholder, new SampleFragment(), sample_fragment)
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}