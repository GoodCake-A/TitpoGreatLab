// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import com.crystalpigeon.busnovisad.model.Service;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideServiceFactory implements Factory<Service> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideServiceFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public Service get() {
    return provideService(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvideServiceFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideServiceFactory(module, retrofitProvider);
  }

  public static Service provideService(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}