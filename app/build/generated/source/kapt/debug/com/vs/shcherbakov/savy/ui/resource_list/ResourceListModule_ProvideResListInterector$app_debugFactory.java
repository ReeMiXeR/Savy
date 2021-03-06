// Generated by Dagger (https://google.github.io/dagger).
package com.vs.shcherbakov.savy.ui.resource_list;

import com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ResourceListModule_ProvideResListInterector$app_debugFactory
    implements Factory<ResListInterector> {
  private final ResourceListModule module;

  public ResourceListModule_ProvideResListInterector$app_debugFactory(ResourceListModule module) {
    this.module = module;
  }

  @Override
  public ResListInterector get() {
    return Preconditions.checkNotNull(
        module.provideResListInterector$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ResourceListModule_ProvideResListInterector$app_debugFactory create(
      ResourceListModule module) {
    return new ResourceListModule_ProvideResListInterector$app_debugFactory(module);
  }

  public static ResListInterector proxyProvideResListInterector$app_debug(
      ResourceListModule instance) {
    return Preconditions.checkNotNull(
        instance.provideResListInterector$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
