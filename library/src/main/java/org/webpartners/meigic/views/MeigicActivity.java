package org.webpartners.meigic.views;

import org.webpartners.meigic.presenters.MeigicPresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Project: Meigic
 * <p>
 * Created by Jorge Garrido Oval on 20/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicActivity <P extends MeigicPresenter> extends AppCompatActivity {

    protected P presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutResourceId());

        initializeUI();

        this.presenter = initializePresenter();
        this.presenter.initialize();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    protected abstract P initializePresenter();

    protected abstract int getLayoutResourceId();

    protected abstract void initializeUI();
}
