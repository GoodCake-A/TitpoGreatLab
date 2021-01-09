package com.crystalpigeon.busnovisad.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\rH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\rH\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/crystalpigeon/busnovisad/di/StorageModule;", "", "()V", "getEditor", "Landroid/content/SharedPreferences$Editor;", "preferences", "Landroid/content/SharedPreferences;", "getSharedPrefs", "context", "Landroid/content/Context;", "provideLanesRepository", "Lcom/crystalpigeon/busnovisad/model/repository/LanesRepository;", "provideRoomDatabase", "Lcom/crystalpigeon/busnovisad/model/BusDatabase;", "provideScheduleRepository", "Lcom/crystalpigeon/busnovisad/model/repository/ScheduleRepository;", "provideSchedulesDao", "Lcom/crystalpigeon/busnovisad/model/dao/SchedulesDao;", "db", "provideSeasonRepository", "Lcom/crystalpigeon/busnovisad/model/repository/SeasonRepository;", "providesFavoriteLane", "Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "providesLanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/LanesDao;", "app_debug"})
@dagger.Module()
public final class StorageModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences getSharedPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences.Editor getEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.repository.LanesRepository provideLanesRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.repository.ScheduleRepository provideScheduleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.repository.SeasonRepository provideSeasonRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.BusDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao providesFavoriteLane(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.BusDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.dao.LanesDao providesLanesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.BusDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.crystalpigeon.busnovisad.model.dao.SchedulesDao provideSchedulesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.BusDatabase db) {
        return null;
    }
    
    public StorageModule() {
        super();
    }
}