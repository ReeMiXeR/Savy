// Generated by Dagger (https://google.github.io/dagger).
package com.vs.shcherbakov.savy.ui.resource_list;

import com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ResourceListModule_ProvideResListPresenter$app_debugFactory
    implements Factory<ResListPresenter> {
  private final ResourceListModule module;

  public ResourceListModule_ProvideResListPresenter$app_debugFactory(ResourceListModule module) {
    this.module = module;
  }

  @Override
  public ResListPresenter get() {
    return Preconditions.checkNotNull(
        module.provideResListPresenter$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ResourceListModule_ProvideResListPresenter$app_debugFactory create(
      ResourceListModule module) {
    return new ResourceListModule_ProvideResListPresenter$app_debugFactory(module);
  }

  public static ResListPresenter proxyProvideResListPresenter$app_debug(
      ResourceListModule instance) {
    return Preconditions.checkNotNull(
        instance.provideResListPresenter$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
