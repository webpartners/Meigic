package org.webpartners.meigic.presenters;

/**
 * Project: Meigic
 * <p/>
 * Created by Jorge Garrido Oval on 20/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicPresenter <V extends MeigicPresenter.MeigicView> {

    protected V view;

    private String viewErrorMessage = "Please, first set view";

    public MeigicPresenter(V view) {
        this.view = view;
    }

    public abstract void initialize();

    public abstract void destroy();

    public void checkViewAlreadySet() {
        if (view == null) {
            throw new IllegalArgumentException(viewErrorMessage);
        }
    }

    public interface MeigicView {

    }
}
