// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.model.repository;

import android.content.Context;
import com.crystalpigeon.busnovisad.model.Service;
import com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao;
import com.crystalpigeon.busnovisad.model.dao.LanesDao;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LanesRepository_MembersInjector implements MembersInjector<LanesRepository> {
  private final Provider<Service> apiProvider;

  private final Provider<Context> contextProvider;

  private final Provider<LanesDao> lanesDaoProvider;

  private final Provider<FavoriteLanesDao> favoriteLanesDaoProvider;

  public LanesRepository_MembersInjector(Provider<Service> apiProvider,
      Provider<Context> contextProvider, Provider<LanesDao> lanesDaoProvider,
      Provider<FavoriteLanesDao> favoriteLanesDaoProvider) {
    this.apiProvider = apiProvider;
    this.contextProvider = contextProvider;
    this.lanesDaoProvider = lanesDaoProvider;
    this.favoriteLanesDaoProvider = favoriteLanesDaoProvider;
  }

  public static MembersInjector<LanesRepository> create(Provider<Service> apiProvider,
      Provider<Context> contextProvider, Provider<LanesDao> lanesDaoProvider,
      Provider<FavoriteLanesDao> favoriteLanesDaoProvider) {
    return new LanesRepository_MembersInjector(apiProvider, contextProvider, lanesDaoProvider, favoriteLanesDaoProvider);}

  @Override
  public void injectMembers(LanesRepository instance) {
    injectApi(instance, apiProvider.get());
    injectContext(instance, contextProvider.get());
    injectLanesDao(instance, lanesDaoProvider.get());
    injectFavoriteLanesDao(instance, favoriteLanesDaoProvider.get());
  }

  public static void injectApi(LanesRepository instance, Service api) {
    instance.api = api;
  }

  public static void injectContext(LanesRepository instance, Context context) {
    instance.context = context;
  }

  public static void injectLanesDao(LanesRepository instance, LanesDao lanesDao) {
    instance.lanesDao = lanesDao;
  }

  public static void injectFavoriteLanesDao(LanesRepository instance,
      FavoriteLanesDao favoriteLanesDao) {
    instance.favoriteLanesDao = favoriteLanesDao;
  }
}
