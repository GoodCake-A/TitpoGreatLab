// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import android.content.Context;
import com.crystalpigeon.busnovisad.model.BusDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StorageModule_ProvideRoomDatabaseFactory implements Factory<BusDatabase> {
  private final StorageModule module;

  private final Provider<Context> contextProvider;

  public StorageModule_ProvideRoomDatabaseFactory(StorageModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BusDatabase get() {
    return provideRoomDatabase(module, contextProvider.get());
  }

  public static StorageModule_ProvideRoomDatabaseFactory create(StorageModule module,
      Provider<Context> contextProvider) {
    return new StorageModule_ProvideRoomDatabaseFactory(module, contextProvider);
  }

  public static BusDatabase provideRoomDatabase(StorageModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideRoomDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
