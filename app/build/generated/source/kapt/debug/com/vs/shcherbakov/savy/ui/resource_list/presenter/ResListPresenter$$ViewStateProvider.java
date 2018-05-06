package com.vs.shcherbakov.savy.ui.resource_list.presenter;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class ResListPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView$$State();
	}
}