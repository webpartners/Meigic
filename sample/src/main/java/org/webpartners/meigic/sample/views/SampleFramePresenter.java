package org.webpartners.meigic.sample.views;


import org.webpartners.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic sample
 *
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
 */
public class SampleFramePresenter extends MeigicPresenter<SampleFramePresenter.SampleFrameView> {

    public SampleFramePresenter(SampleFrameView view) {
        super(view);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void destroy() {

    }

    public interface SampleFrameView extends MeigicPresenter.MeigicView {

    }
}
