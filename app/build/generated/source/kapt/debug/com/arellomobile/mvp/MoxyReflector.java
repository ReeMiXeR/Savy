package com.arellomobile.mvp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoxyReflector {

	private static Map<Class<?>, Object> sViewStateProviders;
	private static Map<Class<?>, List<Object>> sPresenterBinders;
	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter.class, new com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter.class, new com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter.class, new com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter.class, new com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter.class, new com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter$$ViewStateProvider());
		
		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(com.vs.shcherbakov.savy.ui.auth.view.AuthActivity.class, Arrays.<Object>asList(new com.vs.shcherbakov.savy.ui.auth.view.AuthActivity$$PresentersBinder()));
		sPresenterBinders.put(com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment.class, Arrays.<Object>asList(new com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment$$PresentersBinder()));
		sPresenterBinders.put(com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment.class, Arrays.<Object>asList(new com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment$$PresentersBinder()));
		sPresenterBinders.put(com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment.class, Arrays.<Object>asList(new com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment$$PresentersBinder()));
		sPresenterBinders.put(com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity.class, Arrays.<Object>asList(new com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity$$PresentersBinder()));
		
		sStrategies = new HashMap<>();
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class, new com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy());
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class, new com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy());
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class, new com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy());
	}
	
	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}
		
		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}

	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}
