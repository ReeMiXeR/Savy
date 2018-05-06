package com.vs.shcherbakov.savy.ui.resource_list.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class ResourceListView$$State extends MvpViewState<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> implements com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView {

	@Override
	public  void openFile(@org.jetbrains.annotations.NotNull java.io.File file, @org.jetbrains.annotations.NotNull com.vs.shcherbakov.savy.model.ResItem resource) {
		OpenFileCommand openFileCommand = new OpenFileCommand(file, resource);
		mViewCommands.beforeApply(openFileCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
			view.openFile(file, resource);
		}

		mViewCommands.afterApply(openFileCommand);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
			view.displayItems(resList);
		}

		mViewCommands.afterApply(displayItemsCommand);
	}

	@Override
	public  void openPath(@org.jetbrains.annotations.NotNull java.lang.String path) {
		OpenPathCommand openPathCommand = new OpenPathCommand(path);
		mViewCommands.beforeApply(openPathCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
			view.openPath(path);
		}

		mViewCommands.afterApply(openPathCommand);
	}

	@Override
	public  void showToast(@org.jetbrains.annotations.NotNull java.lang.String text) {
		ShowToastCommand showToastCommand = new ShowToastCommand(text);
		mViewCommands.beforeApply(showToastCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
			view.showToast(text);
		}

		mViewCommands.afterApply(showToastCommand);
	}

	@Override
	public  void deleteResource(@org.jetbrains.annotations.NotNull com.vs.shcherbakov.savy.model.ResItem res) {
		DeleteResourceCommand deleteResourceCommand = new DeleteResourceCommand(res);
		mViewCommands.beforeApply(deleteResourceCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
			view.deleteResource(res);
		}

		mViewCommands.afterApply(deleteResourceCommand);
	}

	@Override
	public  void showDownloadProgress() {
		ShowDownloadProgressCommand showDownloadProgressCommand = new ShowDownloadProgressCommand();
		mViewCommands.beforeApply(showDownloadProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
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

		for(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView view : mViews) {
			view.hideProgress();
		}

		mViewCommands.afterApply(hideProgressCommand);
	}


	public class OpenFileCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		public final java.io.File file;
		public final com.vs.shcherbakov.savy.model.ResItem resource;

		OpenFileCommand(@org.jetbrains.annotations.NotNull java.io.File file, @org.jetbrains.annotations.NotNull com.vs.shcherbakov.savy.model.ResItem resource) {
			super("openFile", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
			this.file = file;
			this.resource = resource;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.openFile(file, resource);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.showLoading();
		}
	}

	public class ShowEmptyCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		ShowEmptyCommand() {
			super("showEmpty", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.showEmpty();
		}
	}

	public class ShowErrorCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		ShowErrorCommand() {
			super("showError", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.showError();
		}
	}

	public class DisplayItemsCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		public final java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList;

		DisplayItemsCommand(@org.jetbrains.annotations.NotNull java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList) {
			super("displayItems", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
			this.resList = resList;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.displayItems(resList);
		}
	}

	public class OpenPathCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		public final java.lang.String path;

		OpenPathCommand(@org.jetbrains.annotations.NotNull java.lang.String path) {
			super("openPath", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
			this.path = path;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.openPath(path);
		}
	}

	public class ShowToastCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		public final java.lang.String text;

		ShowToastCommand(@org.jetbrains.annotations.NotNull java.lang.String text) {
			super("showToast", com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class);
			this.text = text;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.showToast(text);
		}
	}

	public class DeleteResourceCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		public final com.vs.shcherbakov.savy.model.ResItem res;

		DeleteResourceCommand(@org.jetbrains.annotations.NotNull com.vs.shcherbakov.savy.model.ResItem res) {
			super("deleteResource", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
			this.res = res;
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.deleteResource(res);
		}
	}

	public class ShowDownloadProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		ShowDownloadProgressCommand() {
			super("showDownloadProgress", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.showDownloadProgress();
		}
	}

	public class HideDownloadProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		HideDownloadProgressCommand() {
			super("hideDownloadProgress", com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.hideDownloadProgress();
		}
	}

	public class ShowProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		ShowProgressCommand() {
			super("showProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.showProgress();
		}
	}

	public class HideProgressCommand extends ViewCommand<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
		HideProgressCommand() {
			super("hideProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView mvpView) {
			mvpView.hideProgress();
		}
	}
}