// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import com.crystalpigeon.busnovisad.model.BusDatabase;
import com.crystalpigeon.busnovisad.model.dao.SchedulesDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StorageModule_ProvideSchedulesDaoFactory implements Factory<SchedulesDao> {
  private final StorageModule module;

  private final Provider<BusDatabase> dbProvider;

  public StorageModule_ProvideSchedulesDaoFactory(StorageModule module,
      Provider<BusDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public SchedulesDao get() {
    return provideSchedulesDao(module, dbProvider.get());
  }

  public static StorageModule_ProvideSchedulesDaoFactory create(StorageModule module,
      Provider<BusDatabase> dbProvider) {
    return new StorageModule_ProvideSchedulesDaoFactory(module, dbProvider);
  }

  public static SchedulesDao provideSchedulesDao(StorageModule instance, BusDatabase db) {
    return Preconditions.checkNotNull(instance.provideSchedulesDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}