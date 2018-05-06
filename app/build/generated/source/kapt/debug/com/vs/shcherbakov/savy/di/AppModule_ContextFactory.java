// Generated by Dagger (https://google.github.io/dagger).
package com.vs.shcherbakov.savy.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ContextFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.context(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ContextFactory create(AppModule module) {
    return new AppModule_ContextFactory(module);
  }

  public static Context proxyContext(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.context(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
