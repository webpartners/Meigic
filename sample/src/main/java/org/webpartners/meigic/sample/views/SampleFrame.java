package org.webpartners.meigic.sample.views;

import org.webpartners.meigic.sample.R;
import org.webpartners.meigic.views.MeigicViewGroup;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Project: Meigic sample
 * <p/>
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
 */
public class SampleFrame
        extends MeigicViewGroup<SampleFramePresenter>
        implements SampleFramePresenter.SampleFrameView {


    public SampleFrame(Context context) {
        this(context, null);
    }

    public SampleFrame(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SampleFrame(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected SampleFramePresenter initializePresenter() {
        return new SampleFramePresenter(this);
    }

    @Override
    protected void initializeUI() {
        inflate(getContext(), R.layout.sample_frame_view, this);
    }
}
