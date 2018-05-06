package com.vs.shcherbakov.savy.ui.settings.view;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class SettingsFragment$$PresentersBinder extends PresenterBinder<com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment> {
	public class presenterBinder extends PresenterField<com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter.class);
		}

		@Override
		public void bind(com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment target, MvpPresenter presenter) {
			target.presenter = (com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment delegated) {
			return new com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter();
		}
	}

	public List<PresenterField<com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment>> getPresenterFields() {
		List<PresenterField<com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
