// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StorageModule_GetEditorFactory implements Factory<SharedPreferences.Editor> {
  private final StorageModule module;

  private final Provider<SharedPreferences> preferencesProvider;

  public StorageModule_GetEditorFactory(StorageModule module,
      Provider<SharedPreferences> preferencesProvider) {
    this.module = module;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public SharedPreferences.Editor get() {
    return getEditor(module, preferencesProvider.get());
  }

  public static StorageModule_GetEditorFactory create(StorageModule module,
      Provider<SharedPreferences> preferencesProvider) {
    return new StorageModule_GetEditorFactory(module, preferencesProvider);
  }

  public static SharedPreferences.Editor getEditor(StorageModule instance,
      SharedPreferences preferences) {
    return Preconditions.checkNotNull(instance.getEditor(preferences), "Cannot return null from a non-@Nullable @Provides method");
  }
}