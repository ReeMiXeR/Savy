package com.vs.shcherbakov.savy.ui.image_list.view;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class ImageListFragment$$PresentersBinder extends PresenterBinder<com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment> {
	public class presenterBinder extends PresenterField<com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter.class);
		}

		@Override
		public void bind(com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment target, MvpPresenter presenter) {
			target.presenter = (com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment delegated) {
			return new com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter();
		}
	}

	public List<PresenterField<com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment>> getPresenterFields() {
		List<PresenterField<com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
