package com.vs.shcherbakov.savy.ui.settings.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class SettingsView$$State extends MvpViewState<com.vs.shcherbakov.savy.ui.settings.view.SettingsView> implements com.vs.shcherbakov.savy.ui.settings.view.SettingsView {

	@Override
	public  void finish() {
		FinishCommand finishCommand = new FinishCommand();
		mViewCommands.beforeApply(finishCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.settings.view.SettingsView view : mViews) {
			view.finish();
		}

		mViewCommands.afterApply(finishCommand);
	}

	@Override
	public  void showProgress() {
		ShowProgressCommand showProgressCommand = new ShowProgressCommand();
		mViewCommands.beforeApply(showProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.settings.view.SettingsView view : mViews) {
			view.showProgress();
		}

		mViewCommands.afterApply(showProgressCommand);
	}

	@Override
	public  void hideProgress() {
		HideProgressCommand hideProgressCommand = new HideProgressCommand();
		mViewCommands.beforeApply(hideProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.settings.view.SettingsView view : mViews) {
			view.hideProgress();
		}

		mViewCommands.afterApply(hideProgressCommand);
	}


	public class FinishCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.settings.view.SettingsView> {
		FinishCommand() {
			super("finish", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.settings.view.SettingsView mvpView) {
			mvpView.finish();
		}
	}

	public class ShowProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.settings.view.SettingsView> {
		ShowProgressCommand() {
			super("showProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.settings.view.SettingsView mvpView) {
			mvpView.showProgress();
		}
	}

	public class HideProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.settings.view.SettingsView> {
		HideProgressCommand() {
			super("hideProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.settings.view.SettingsView mvpView) {
			mvpView.hideProgress();
		}
	}
}
