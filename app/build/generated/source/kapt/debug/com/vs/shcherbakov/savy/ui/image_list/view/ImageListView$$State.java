package com.vs.shcherbakov.savy.ui.image_list.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class ImageListView$$State extends MvpViewState<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> implements com.vs.shcherbakov.savy.ui.image_list.view.ImageListView {

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.showLoading();
		}

		mViewCommands.afterApply(showLoadingCommand);
	}

	@Override
	public  void showEmpty() {
		ShowEmptyCommand showEmptyCommand = new ShowEmptyCommand();
		mViewCommands.beforeApply(showEmptyCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.showEmpty();
		}

		mViewCommands.afterApply(showEmptyCommand);
	}

	@Override
	public  void showError() {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand();
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.showError();
		}

		mViewCommands.afterApply(showErrorCommand);
	}

	@Override
	public  void displayItems(@org.jetbrains.annotations.NotNull java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList) {
		DisplayItemsCommand displayItemsCommand = new DisplayItemsCommand(resList);
		mViewCommands.beforeApply(displayItemsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.displayItems(resList);
		}

		mViewCommands.afterApply(displayItemsCommand);
	}

	@Override
	public  void openImage(@org.jetbrains.annotations.NotNull java.lang.String path) {
		OpenImageCommand openImageCommand = new OpenImageCommand(path);
		mViewCommands.beforeApply(openImageCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.openImage(path);
		}

		mViewCommands.afterApply(openImageCommand);
	}

	@Override
	public  void showDownloadProgress() {
		ShowDownloadProgressCommand showDownloadProgressCommand = new ShowDownloadProgressCommand();
		mViewCommands.beforeApply(showDownloadProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.showDownloadProgress();
		}

		mViewCommands.afterApply(showDownloadProgressCommand);
	}

	@Override
	public  void hideDownloadProgress() {
		HideDownloadProgressCommand hideDownloadProgressCommand = new HideDownloadProgressCommand();
		mViewCommands.beforeApply(hideDownloadProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.hideDownloadProgress();
		}

		mViewCommands.afterApply(hideDownloadProgressCommand);
	}

	@Override
	public  void showProgress() {
		ShowProgressCommand showProgressCommand = new ShowProgressCommand();
		mViewCommands.beforeApply(showProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView view : mViews) {
			view.hideProgress();
		}

		mViewCommands.afterApply(hideProgressCommand);
	}


	public class ShowLoadingCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.showLoading();
		}
	}

	public class ShowEmptyCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		ShowEmptyCommand() {
			super("showEmpty", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.showEmpty();
		}
	}

	public class ShowErrorCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		ShowErrorCommand() {
			super("showError", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.showError();
		}
	}

	public class DisplayItemsCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		public final java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList;

		DisplayItemsCommand(@org.jetbrains.annotations.NotNull java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList) {
			super("displayItems", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
			this.resList = resList;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.displayItems(resList);
		}
	}

	public class OpenImageCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		public final java.lang.String path;

		OpenImageCommand(@org.jetbrains.annotations.NotNull java.lang.String path) {
			super("openImage", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
			this.path = path;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.openImage(path);
		}
	}

	public class ShowDownloadProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		ShowDownloadProgressCommand() {
			super("showDownloadProgress", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.showDownloadProgress();
		}
	}

	public class HideDownloadProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		HideDownloadProgressCommand() {
			super("hideDownloadProgress", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.hideDownloadProgress();
		}
	}

	public class ShowProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		ShowProgressCommand() {
			super("showProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.showProgress();
		}
	}

	public class HideProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
		HideProgressCommand() {
			super("hideProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.image_list.view.ImageListView mvpView) {
			mvpView.hideProgress();
		}
	}
}
