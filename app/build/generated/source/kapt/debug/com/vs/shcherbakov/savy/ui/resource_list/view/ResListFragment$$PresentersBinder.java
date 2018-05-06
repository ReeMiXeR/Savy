package com.vs.shcherbakov.savy.ui.resource_list.view;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class ResListFragment$$PresentersBinder extends PresenterBinder<com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment> {
	public class presenterBinder extends PresenterField<com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter.class);
		}

		@Override
		public void bind(com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment target, MvpPresenter presenter) {
			target.presenter = (com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment delegated) {
			return new com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter();
		}
	}

	public List<PresenterField<com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment>> getPresenterFields() {
		List<PresenterField<com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
