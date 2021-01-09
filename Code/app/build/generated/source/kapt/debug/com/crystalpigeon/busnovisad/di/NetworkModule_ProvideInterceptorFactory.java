// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideInterceptorFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideInterceptor(module);
  }

  public static NetworkModule_ProvideInterceptorFactory create(NetworkModule module) {
    return new NetworkModule_ProvideInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor provideInterceptor(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
