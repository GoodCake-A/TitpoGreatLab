// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import com.crystalpigeon.busnovisad.model.repository.ScheduleRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StorageModule_ProvideScheduleRepositoryFactory implements Factory<ScheduleRepository> {
  private final StorageModule module;

  public StorageModule_ProvideScheduleRepositoryFactory(StorageModule module) {
    this.module = module;
  }

  @Override
  public ScheduleRepository get() {
    return provideScheduleRepository(module);
  }

  public static StorageModule_ProvideScheduleRepositoryFactory create(StorageModule module) {
    return new StorageModule_ProvideScheduleRepositoryFactory(module);
  }

  public static ScheduleRepository provideScheduleRepository(StorageModule instance) {
    return Preconditions.checkNotNull(instance.provideScheduleRepository(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
