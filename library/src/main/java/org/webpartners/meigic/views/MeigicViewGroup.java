package org.webpartners.meigic.views;

import org.webpartners.meigic.presenters.MeigicPresenter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Project: Meigic
 * <p>
 * Created by Jorge Garrido Oval on 20/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicViewGroup <P extends MeigicPresenter> extends FrameLayout {

    protected P presenter;

    public MeigicViewGroup(Context context) {
        this(context, null);
    }

    public MeigicViewGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MeigicViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.initializeUI();
        presenter = this.initializePresenter();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.initialize();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        presenter.destroy();
    }

    protected abstract P initializePresenter();

    protected abstract void initializeUI();
}
