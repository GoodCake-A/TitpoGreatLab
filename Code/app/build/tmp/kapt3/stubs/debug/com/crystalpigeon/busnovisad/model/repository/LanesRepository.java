package com.crystalpigeon.busnovisad.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0#2\u0006\u0010$\u001a\u00020%J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\'\u001a\u00020(2\u0006\u0010$\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/crystalpigeon/busnovisad/model/repository/LanesRepository;", "", "()V", "api", "Lcom/crystalpigeon/busnovisad/model/Service;", "getApi", "()Lcom/crystalpigeon/busnovisad/model/Service;", "setApi", "(Lcom/crystalpigeon/busnovisad/model/Service;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "favoriteLanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "getFavoriteLanesDao", "()Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "setFavoriteLanesDao", "(Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;)V", "lanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/LanesDao;", "getLanesDao", "()Lcom/crystalpigeon/busnovisad/model/dao/LanesDao;", "setLanesDao", "(Lcom/crystalpigeon/busnovisad/model/dao/LanesDao;)V", "cacheAllLanes", "Lcom/crystalpigeon/busnovisad/model/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "getLanes", "Landroidx/lifecycle/LiveData;", "type", "", "getNonFavorites", "refreshLanes", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class LanesRepository {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.Service api;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.dao.LanesDao lanesDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao favoriteLanesDao;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.Service getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.Service p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.dao.LanesDao getLanesDao() {
        return null;
    }
    
    public final void setLanesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.dao.LanesDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao getFavoriteLanesDao() {
        return null;
    }
    
    public final void setFavoriteLanesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane>> getLanes(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNonFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cacheAllLanes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crystalpigeon.busnovisad.model.Result<java.lang.Boolean>> p0) {
        return null;
    }
    
    public LanesRepository() {
        super();
    }
}