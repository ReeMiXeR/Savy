// Generated by Dagger (https://google.github.io/dagger).
package com.vs.shcherbakov.savy.ui.image_list;

import com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ImageListModule_ProvideImageListPresenter$app_debugFactory
    implements Factory<ImageListPresenter> {
  private final ImageListModule module;

  public ImageListModule_ProvideImageListPresenter$app_debugFactory(ImageListModule module) {
    this.module = module;
  }

  @Override
  public ImageListPresenter get() {
    return Preconditions.checkNotNull(
        module.provideImageListPresenter$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ImageListModule_ProvideImageListPresenter$app_debugFactory create(
      ImageListModule module) {
    return new ImageListModule_ProvideImageListPresenter$app_debugFactory(module);
  }

  public static ImageListPresenter proxyProvideImageListPresenter$app_debug(
      ImageListModule instance) {
    return Preconditions.checkNotNull(
        instance.provideImageListPresenter$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
