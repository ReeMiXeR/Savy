package com.vs.shcherbakov.savy.ui.image_list.presenter;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class ImageListPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.vs.shcherbakov.savy.ui.image_list.view.ImageListView$$State();
	}
}