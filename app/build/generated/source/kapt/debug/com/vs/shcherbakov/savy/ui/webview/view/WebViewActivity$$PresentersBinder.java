package com.vs.shcherbakov.savy.ui.webview.view;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class WebViewActivity$$PresentersBinder extends PresenterBinder<com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity> {
	public class presenterBinder extends PresenterField<com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter.class);
		}

		@Override
		public void bind(com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity target, MvpPresenter presenter) {
			target.presenter = (com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity delegated) {
			return new com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter();
		}
	}

	public List<PresenterField<com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity>> getPresenterFields() {
		List<PresenterField<com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
