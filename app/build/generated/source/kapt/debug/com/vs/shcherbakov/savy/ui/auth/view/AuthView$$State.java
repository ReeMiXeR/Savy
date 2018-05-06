package com.vs.shcherbakov.savy.ui.auth.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class AuthView$$State extends MvpViewState<com.vs.shcherbakov.savy.ui.auth.view.AuthView> implements com.vs.shcherbakov.savy.ui.auth.view.AuthView {

	@Override
	public  void openAuthWebView() {
		OpenAuthWebViewCommand openAuthWebViewCommand = new OpenAuthWebViewCommand();
		mViewCommands.beforeApply(openAuthWebViewCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.auth.view.AuthView view : mViews) {
			view.openAuthWebView();
		}

		mViewCommands.afterApply(openAuthWebViewCommand);
	}

	@Override
	public  void openMainActivity() {
		OpenMainActivityCommand openMainActivityCommand = new OpenMainActivityCommand();
		mViewCommands.beforeApply(openMainActivityCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.auth.view.AuthView view : mViews) {
			view.openMainActivity();
		}

		mViewCommands.afterApply(openMainActivityCommand);
	}

	@Override
	public  void showProgress() {
		ShowProgressCommand showProgressCommand = new ShowProgressCommand();
		mViewCommands.beforeApply(showProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.auth.view.AuthView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.auth.view.AuthView view : mViews) {
			view.hideProgress();
		}

		mViewCommands.afterApply(hideProgressCommand);
	}


	public class OpenAuthWebViewCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.auth.view.AuthView> {
		OpenAuthWebViewCommand() {
			super("openAuthWebView", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.auth.view.AuthView mvpView) {
			mvpView.openAuthWebView();
		}
	}

	public class OpenMainActivityCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.auth.view.AuthView> {
		OpenMainActivityCommand() {
			super("openMainActivity", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.auth.view.AuthView mvpView) {
			mvpView.openMainActivity();
		}
	}

	public class ShowProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.auth.view.AuthView> {
		ShowProgressCommand() {
			super("showProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.auth.view.AuthView mvpView) {
			mvpView.showProgress();
		}
	}

	public class HideProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.auth.view.AuthView> {
		HideProgressCommand() {
			super("hideProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.auth.view.AuthView mvpView) {
			mvpView.hideProgress();
		}
	}
}
