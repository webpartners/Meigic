package org.webpartners.meigic.sample.fragments;


import org.webpartners.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic sample
 * <p>
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
 */
public class SampleFragmentPresenter extends MeigicPresenter<SampleFragmentPresenter.SampleFragmentView> {

    public SampleFragmentPresenter(SampleFragmentView view) {
        super(view);
    }

    @Override
    public void initialize() {
        checkViewAlreadySet();
        // initialize presenter here
    }

    @Override
    public void destroy() {
        // destroy presenter here, we don't want memory leaks!
    }

    public interface SampleFragmentView extends MeigicPresenter.MeigicView {
        // add your contract methods here
    }
}
