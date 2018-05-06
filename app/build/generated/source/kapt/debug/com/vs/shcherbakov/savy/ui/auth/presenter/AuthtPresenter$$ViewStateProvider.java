package com.vs.shcherbakov.savy.ui.auth.presenter;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class AuthtPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.vs.shcherbakov.savy.ui.auth.view.AuthView$$State();
	}
}