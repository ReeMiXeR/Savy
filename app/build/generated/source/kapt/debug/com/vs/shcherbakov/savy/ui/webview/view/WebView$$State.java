package com.vs.shcherbakov.savy.ui.webview.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class WebView$$State extends MvpViewState<com.vs.shcherbakov.savy.ui.webview.view.WebView> implements com.vs.shcherbakov.savy.ui.webview.view.WebView {

	@Override
	public  void loadAuthUrl() {
		LoadAuthUrlCommand loadAuthUrlCommand = new LoadAuthUrlCommand();
		mViewCommands.beforeApply(loadAuthUrlCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.webview.view.WebView view : mViews) {
			view.loadAuthUrl();
		}

		mViewCommands.afterApply(loadAuthUrlCommand);
	}

	@Override
	public  void finishWebViewActivity(@org.jetbrains.annotations.NotNull java.lang.String token) {
		FinishWebViewActivityCommand finishWebViewActivityCommand = new FinishWebViewActivityCommand(token);
		mViewCommands.beforeApply(finishWebViewActivityCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.webview.view.WebView view : mViews) {
			view.finishWebViewActivity(token);
		}

		mViewCommands.afterApply(finishWebViewActivityCommand);
	}

	@Override
	public  void showProgress() {
		ShowProgressCommand showProgressCommand = new ShowProgressCommand();
		mViewCommands.beforeApply(showProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.webview.view.WebView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.webview.view.WebView view : mViews) {
			view.hideProgress();
		}

		mViewCommands.afterApply(hideProgressCommand);
	}


	public class LoadAuthUrlCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.webview.view.WebView> {
		LoadAuthUrlCommand() {
			super("loadAuthUrl", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.webview.view.WebView mvpView) {
			mvpView.loadAuthUrl();
		}
	}

	public class FinishWebViewActivityCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.webview.view.WebView> {
		public final java.lang.String token;

		FinishWebViewActivityCommand(@org.jetbrains.annotations.NotNull java.lang.String token) {
			super("finishWebViewActivity", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.token = token;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.webview.view.WebView mvpView) {
			mvpView.finishWebViewActivity(token);
		}
	}

	public class ShowProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.webview.view.WebView> {
		ShowProgressCommand() {
			super("showProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.webview.view.WebView mvpView) {
			mvpView.showProgress();
		}
	}

	public class HideProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.webview.view.WebView> {
		HideProgressCommand() {
			super("hideProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.webview.view.WebView mvpView) {
			mvpView.hideProgress();
		}
	}
}
