// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.crystalpigeon.busnovisad.model.BusDatabase;
import com.crystalpigeon.busnovisad.model.Service;
import com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao;
import com.crystalpigeon.busnovisad.model.dao.LanesDao;
import com.crystalpigeon.busnovisad.model.dao.SchedulesDao;
import com.crystalpigeon.busnovisad.model.repository.LanesRepository;
import com.crystalpigeon.busnovisad.model.repository.LanesRepository_MembersInjector;
import com.crystalpigeon.busnovisad.model.repository.ScheduleRepository;
import com.crystalpigeon.busnovisad.model.repository.ScheduleRepository_MembersInjector;
import com.crystalpigeon.busnovisad.model.repository.SeasonRepository;
import com.crystalpigeon.busnovisad.model.repository.SeasonRepository_MembersInjector;
import com.crystalpigeon.busnovisad.view.MainActivity;
import com.crystalpigeon.busnovisad.view.MainActivity_MembersInjector;
import com.crystalpigeon.busnovisad.view.fragment.SettingsFragment;
import com.crystalpigeon.busnovisad.view.fragment.SettingsFragment_MembersInjector;
import com.crystalpigeon.busnovisad.viewmodel.LanesViewModel;
import com.crystalpigeon.busnovisad.viewmodel.LanesViewModel_MembersInjector;
import com.crystalpigeon.busnovisad.viewmodel.MainViewModel;
import com.crystalpigeon.busnovisad.viewmodel.MainViewModel_MembersInjector;
import com.crystalpigeon.busnovisad.viewmodel.ScheduleViewModel;
import com.crystalpigeon.busnovisad.viewmodel.ScheduleViewModel_MembersInjector;
import com.crystalpigeon.busnovisad.viewmodel.SortViewModel;
import com.crystalpigeon.busnovisad.viewmodel.SortViewModel_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<HttpLoggingInterceptor> provideInterceptorProvider;

  private Provider<OkHttpClient> provideClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<Service> provideServiceProvider;

  private Provider<Context> provideContextProvider;

  private Provider<SharedPreferences> getSharedPrefsProvider;

  private Provider<SharedPreferences.Editor> getEditorProvider;

  private Provider<BusDatabase> provideRoomDatabaseProvider;

  private Provider<SchedulesDao> provideSchedulesDaoProvider;

  private Provider<LanesDao> providesLanesDaoProvider;

  private Provider<FavoriteLanesDao> providesFavoriteLaneProvider;

  private Provider<LanesRepository> provideLanesRepositoryProvider;

  private Provider<ScheduleRepository> provideScheduleRepositoryProvider;

  private Provider<SeasonRepository> provideSeasonRepositoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, NetworkModule networkModuleParam,
      StorageModule storageModuleParam) {

    initialize(appModuleParam, networkModuleParam, storageModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final NetworkModule networkModuleParam,
      final StorageModule storageModuleParam) {
    this.provideInterceptorProvider = NetworkModule_ProvideInterceptorFactory.create(networkModuleParam);
    this.provideClientProvider = NetworkModule_ProvideClientFactory.create(networkModuleParam, provideInterceptorProvider);
    this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(networkModuleParam, provideClientProvider));
    this.provideServiceProvider = DoubleCheck.provider(NetworkModule_ProvideServiceFactory.create(networkModuleParam, provideRetrofitProvider));
    this.provideContextProvider = DoubleCheck.provider(AppModule_ProvideContextFactory.create(appModuleParam));
    this.getSharedPrefsProvider = DoubleCheck.provider(StorageModule_GetSharedPrefsFactory.create(storageModuleParam, provideContextProvider));
    this.getEditorProvider = DoubleCheck.provider(StorageModule_GetEditorFactory.create(storageModuleParam, getSharedPrefsProvider));
    this.provideRoomDatabaseProvider = DoubleCheck.provider(StorageModule_ProvideRoomDatabaseFactory.create(storageModuleParam, provideContextProvider));
    this.provideSchedulesDaoProvider = DoubleCheck.provider(StorageModule_ProvideSchedulesDaoFactory.create(storageModuleParam, provideRoomDatabaseProvider));
    this.providesLanesDaoProvider = DoubleCheck.provider(StorageModule_ProvidesLanesDaoFactory.create(storageModuleParam, provideRoomDatabaseProvider));
    this.providesFavoriteLaneProvider = DoubleCheck.provider(StorageModule_ProvidesFavoriteLaneFactory.create(storageModuleParam, provideRoomDatabaseProvider));
    this.provideLanesRepositoryProvider = DoubleCheck.provider(StorageModule_ProvideLanesRepositoryFactory.create(storageModuleParam));
    this.provideScheduleRepositoryProvider = DoubleCheck.provider(StorageModule_ProvideScheduleRepositoryFactory.create(storageModuleParam));
    this.provideSeasonRepositoryProvider = DoubleCheck.provider(StorageModule_ProvideSeasonRepositoryFactory.create(storageModuleParam));
  }

  @Override
  public void inject(SeasonRepository seasonRepository) {
    injectSeasonRepository(seasonRepository);}

  @Override
  public void inject(LanesRepository lanesRepository) {
    injectLanesRepository(lanesRepository);}

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);}

  @Override
  public void inject(LanesViewModel lanesViewModel) {
    injectLanesViewModel(lanesViewModel);}

  @Override
  public void inject(ScheduleRepository repository) {
    injectScheduleRepository(repository);}

  @Override
  public void inject(MainViewModel mainViewModel) {
    injectMainViewModel(mainViewModel);}

  @Override
  public void inject(SettingsFragment settingsFragment) {
    injectSettingsFragment(settingsFragment);}

  @Override
  public void inject(SortViewModel sortViewModel) {
    injectSortViewModel(sortViewModel);}

  @Override
  public void inject(ScheduleViewModel scheduleViewModel) {
    injectScheduleViewModel(scheduleViewModel);}

  private SeasonRepository injectSeasonRepository(SeasonRepository instance) {
    SeasonRepository_MembersInjector.injectApi(instance, provideServiceProvider.get());
    SeasonRepository_MembersInjector.injectSharedPrefs(instance, getSharedPrefsProvider.get());
    SeasonRepository_MembersInjector.injectPrefsEdit(instance, getEditorProvider.get());
    SeasonRepository_MembersInjector.injectSchedulesDao(instance, provideSchedulesDaoProvider.get());
    return instance;
  }

  private LanesRepository injectLanesRepository(LanesRepository instance) {
    LanesRepository_MembersInjector.injectApi(instance, provideServiceProvider.get());
    LanesRepository_MembersInjector.injectContext(instance, provideContextProvider.get());
    LanesRepository_MembersInjector.injectLanesDao(instance, providesLanesDaoProvider.get());
    LanesRepository_MembersInjector.injectFavoriteLanesDao(instance, providesFavoriteLaneProvider.get());
    return instance;
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectSharedPreferences(instance, getSharedPrefsProvider.get());
    MainActivity_MembersInjector.injectPrefsEditor(instance, getEditorProvider.get());
    return instance;
  }

  private LanesViewModel injectLanesViewModel(LanesViewModel instance) {
    LanesViewModel_MembersInjector.injectLanesRepository(instance, provideLanesRepositoryProvider.get());
    LanesViewModel_MembersInjector.injectFavLanesDao(instance, providesFavoriteLaneProvider.get());
    return instance;
  }

  private ScheduleRepository injectScheduleRepository(ScheduleRepository instance) {
    ScheduleRepository_MembersInjector.injectApi(instance, provideServiceProvider.get());
    ScheduleRepository_MembersInjector.injectContext(instance, provideContextProvider.get());
    ScheduleRepository_MembersInjector.injectSchedulesDao(instance, provideSchedulesDaoProvider.get());
    ScheduleRepository_MembersInjector.injectFavoriteLanesDao(instance, providesFavoriteLaneProvider.get());
    return instance;
  }

  private MainViewModel injectMainViewModel(MainViewModel instance) {
    MainViewModel_MembersInjector.injectScheduleRepository(instance, provideScheduleRepositoryProvider.get());
    MainViewModel_MembersInjector.injectSeasonRepository(instance, provideSeasonRepositoryProvider.get());
    MainViewModel_MembersInjector.injectLanesRepository(instance, provideLanesRepositoryProvider.get());
    return instance;
  }

  private SettingsFragment injectSettingsFragment(SettingsFragment instance) {
    SettingsFragment_MembersInjector.injectPrefsEdit(instance, getEditorProvider.get());
    SettingsFragment_MembersInjector.injectSharedPrefs(instance, getSharedPrefsProvider.get());
    return instance;
  }

  private SortViewModel injectSortViewModel(SortViewModel instance) {
    SortViewModel_MembersInjector.injectFavoriteLanesDao(instance, providesFavoriteLaneProvider.get());
    return instance;
  }

  private ScheduleViewModel injectScheduleViewModel(ScheduleViewModel instance) {
    ScheduleViewModel_MembersInjector.injectScheduleRepository(instance, provideScheduleRepositoryProvider.get());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private NetworkModule networkModule;

    private StorageModule storageModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder storageModule(StorageModule storageModule) {
      this.storageModule = Preconditions.checkNotNull(storageModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (storageModule == null) {
        this.storageModule = new StorageModule();
      }
      return new DaggerAppComponent(appModule, networkModule, storageModule);
    }
  }
}