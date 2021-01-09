// Generated by Dagger (https://dagger.dev).
package com.crystalpigeon.busnovisad.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<HttpLoggingInterceptor> interceptorProvider;

  public NetworkModule_ProvideClientFactory(NetworkModule module,
      Provider<HttpLoggingInterceptor> interceptorProvider) {
    this.module = module;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideClient(module, interceptorProvider.get());
  }

  public static NetworkModule_ProvideClientFactory create(NetworkModule module,
      Provider<HttpLoggingInterceptor> interceptorProvider) {
    return new NetworkModule_ProvideClientFactory(module, interceptorProvider);
  }

  public static OkHttpClient provideClient(NetworkModule instance,
      HttpLoggingInterceptor interceptor) {
    return Preconditions.checkNotNull(instance.provideClient(interceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
