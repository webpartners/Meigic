package org.webpartners.meigic.views;

import org.webpartners.meigic.presenters.MeigicPresenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Project: Meigic
 * <p/>
 * Created by Jorge Garrido Oval on 26/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicDialog <P extends MeigicPresenter> extends DialogFragment {

    protected P presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResourceId(), container, false);

        this.initializeUI(view);

        this.presenter = initializePresenter();
        this.presenter.initialize();

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        presenter.destroy();
    }

    protected abstract P initializePresenter();

    protected abstract int getLayoutResourceId();

    protected abstract void initializeUI(View view);
}
