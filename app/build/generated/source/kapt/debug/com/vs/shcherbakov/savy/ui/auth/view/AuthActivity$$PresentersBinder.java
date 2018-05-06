package com.vs.shcherbakov.savy.ui.auth.view;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class AuthActivity$$PresentersBinder extends PresenterBinder<com.vs.shcherbakov.savy.ui.auth.view.AuthActivity> {
	public class presenterBinder extends PresenterField<com.vs.shcherbakov.savy.ui.auth.view.AuthActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter.class);
		}

		@Override
		public void bind(com.vs.shcherbakov.savy.ui.auth.view.AuthActivity target, MvpPresenter presenter) {
			target.presenter = (com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.vs.shcherbakov.savy.ui.auth.view.AuthActivity delegated) {
			return new com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter();
		}
	}

	public List<PresenterField<com.vs.shcherbakov.savy.ui.auth.view.AuthActivity>> getPresenterFields() {
		List<PresenterField<com.vs.shcherbakov.savy.ui.auth.view.AuthActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
