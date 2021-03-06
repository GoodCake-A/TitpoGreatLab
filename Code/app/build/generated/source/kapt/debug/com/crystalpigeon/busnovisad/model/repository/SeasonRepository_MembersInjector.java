// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.model.repository;

import android.content.SharedPreferences;
import com.crystalpigeon.busnovisad.model.Service;
import com.crystalpigeon.busnovisad.model.dao.SchedulesDao;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SeasonRepository_MembersInjector implements MembersInjector<SeasonRepository> {
  private final Provider<Service> apiProvider;

  private final Provider<SharedPreferences> sharedPrefsProvider;

  private final Provider<SharedPreferences.Editor> prefsEditProvider;

  private final Provider<SchedulesDao> schedulesDaoProvider;

  public SeasonRepository_MembersInjector(Provider<Service> apiProvider,
      Provider<SharedPreferences> sharedPrefsProvider,
      Provider<SharedPreferences.Editor> prefsEditProvider,
      Provider<SchedulesDao> schedulesDaoProvider) {
    this.apiProvider = apiProvider;
    this.sharedPrefsProvider = sharedPrefsProvider;
    this.prefsEditProvider = prefsEditProvider;
    this.schedulesDaoProvider = schedulesDaoProvider;
  }

  public static MembersInjector<SeasonRepository> create(Provider<Service> apiProvider,
      Provider<SharedPreferences> sharedPrefsProvider,
      Provider<SharedPreferences.Editor> prefsEditProvider,
      Provider<SchedulesDao> schedulesDaoProvider) {
    return new SeasonRepository_MembersInjector(apiProvider, sharedPrefsProvider, prefsEditProvider, schedulesDaoProvider);}

  @Override
  public void injectMembers(SeasonRepository instance) {
    injectApi(instance, apiProvider.get());
    injectSharedPrefs(instance, sharedPrefsProvider.get());
    injectPrefsEdit(instance, prefsEditProvider.get());
    injectSchedulesDao(instance, schedulesDaoProvider.get());
  }

  public static void injectApi(SeasonRepository instance, Service api) {
    instance.api = api;
  }

  public static void injectSharedPrefs(SeasonRepository instance, SharedPreferences sharedPrefs) {
    instance.sharedPrefs = sharedPrefs;
  }

  public static void injectPrefsEdit(SeasonRepository instance,
      SharedPreferences.Editor prefsEdit) {
    instance.prefsEdit = prefsEdit;
  }

  public static void injectSchedulesDao(SeasonRepository instance, SchedulesDao schedulesDao) {
    instance.schedulesDao = schedulesDao;
  }
}
