// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.model.repository;

import android.content.Context;
import com.crystalpigeon.busnovisad.model.Service;
import com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao;
import com.crystalpigeon.busnovisad.model.dao.SchedulesDao;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ScheduleRepository_MembersInjector implements MembersInjector<ScheduleRepository> {
  private final Provider<Service> apiProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SchedulesDao> schedulesDaoProvider;

  private final Provider<FavoriteLanesDao> favoriteLanesDaoProvider;

  public ScheduleRepository_MembersInjector(Provider<Service> apiProvider,
      Provider<Context> contextProvider, Provider<SchedulesDao> schedulesDaoProvider,
      Provider<FavoriteLanesDao> favoriteLanesDaoProvider) {
    this.apiProvider = apiProvider;
    this.contextProvider = contextProvider;
    this.schedulesDaoProvider = schedulesDaoProvider;
    this.favoriteLanesDaoProvider = favoriteLanesDaoProvider;
  }

  public static MembersInjector<ScheduleRepository> create(Provider<Service> apiProvider,
      Provider<Context> contextProvider, Provider<SchedulesDao> schedulesDaoProvider,
      Provider<FavoriteLanesDao> favoriteLanesDaoProvider) {
    return new ScheduleRepository_MembersInjector(apiProvider, contextProvider, schedulesDaoProvider, favoriteLanesDaoProvider);}

  @Override
  public void injectMembers(ScheduleRepository instance) {
    injectApi(instance, apiProvider.get());
    injectContext(instance, contextProvider.get());
    injectSchedulesDao(instance, schedulesDaoProvider.get());
    injectFavoriteLanesDao(instance, favoriteLanesDaoProvider.get());
  }

  public static void injectApi(ScheduleRepository instance, Service api) {
    instance.api = api;
  }

  public static void injectContext(ScheduleRepository instance, Context context) {
    instance.context = context;
  }

  public static void injectSchedulesDao(ScheduleRepository instance, SchedulesDao schedulesDao) {
    instance.schedulesDao = schedulesDao;
  }

  public static void injectFavoriteLanesDao(ScheduleRepository instance,
      FavoriteLanesDao favoriteLanesDao) {
    instance.favoriteLanesDao = favoriteLanesDao;
  }
}
