// Generated by Dagger (https://google.github.io/dagger).
package com.vs.shcherbakov.savy.ui.image_list.interactor;

import com.vs.shcherbakov.savy.data.PrefStorage;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ImageListInterector_MembersInjector
    implements MembersInjector<ImageListInterector> {
  private final Provider<PrefStorage> prefsStorageProvider;

  public ImageListInterector_MembersInjector(Provider<PrefStorage> prefsStorageProvider) {
    this.prefsStorageProvider = prefsStorageProvider;
  }

  public static MembersInjector<ImageListInterector> create(
      Provider<PrefStorage> prefsStorageProvider) {
    return new ImageListInterector_MembersInjector(prefsStorageProvider);
  }

  @Override
  public void injectMembers(ImageListInterector instance) {
    injectPrefsStorage(instance, prefsStorageProvider.get());
  }

  public static void injectPrefsStorage(ImageListInterector instance, PrefStorage prefsStorage) {
    instance.prefsStorage = prefsStorage;
  }
}
