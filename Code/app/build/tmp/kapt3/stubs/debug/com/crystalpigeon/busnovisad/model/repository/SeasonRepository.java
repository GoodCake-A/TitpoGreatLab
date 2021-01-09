package com.crystalpigeon.busnovisad.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0&H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/crystalpigeon/busnovisad/model/repository/SeasonRepository;", "", "()V", "api", "Lcom/crystalpigeon/busnovisad/model/Service;", "getApi", "()Lcom/crystalpigeon/busnovisad/model/Service;", "setApi", "(Lcom/crystalpigeon/busnovisad/model/Service;)V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "prefsEdit", "Landroid/content/SharedPreferences$Editor;", "getPrefsEdit", "()Landroid/content/SharedPreferences$Editor;", "setPrefsEdit", "(Landroid/content/SharedPreferences$Editor;)V", "schedulesDao", "Lcom/crystalpigeon/busnovisad/model/dao/SchedulesDao;", "getSchedulesDao", "()Lcom/crystalpigeon/busnovisad/model/dao/SchedulesDao;", "setSchedulesDao", "(Lcom/crystalpigeon/busnovisad/model/dao/SchedulesDao;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "isEverUpdated", "", "seasonUpdated", "", "shouldUpdate", "Lcom/crystalpigeon/busnovisad/model/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class SeasonRepository {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.Service api;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPrefs;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.SharedPreferences.Editor prefsEdit;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.dao.SchedulesDao schedulesDao;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.Service getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.Service p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPrefs() {
        return null;
    }
    
    public final void setSharedPrefs(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getPrefsEdit() {
        return null;
    }
    
    public final void setPrefsEdit(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.dao.SchedulesDao getSchedulesDao() {
        return null;
    }
    
    public final void setSchedulesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.dao.SchedulesDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object shouldUpdate(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crystalpigeon.busnovisad.model.Result<java.lang.Boolean>> p0) {
        return null;
    }
    
    public final void seasonUpdated() {
    }
    
    public final boolean isEverUpdated() {
        return false;
    }
    
    public SeasonRepository() {
        super();
    }
}