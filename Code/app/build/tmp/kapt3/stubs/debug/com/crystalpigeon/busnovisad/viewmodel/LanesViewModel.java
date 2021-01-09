package com.crystalpigeon.busnovisad.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/crystalpigeon/busnovisad/viewmodel/LanesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "favLanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "getFavLanesDao", "()Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "setFavLanesDao", "(Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;)V", "lanesRepository", "Lcom/crystalpigeon/busnovisad/model/repository/LanesRepository;", "getLanesRepository", "()Lcom/crystalpigeon/busnovisad/model/repository/LanesRepository;", "setLanesRepository", "(Lcom/crystalpigeon/busnovisad/model/repository/LanesRepository;)V", "getLanes", "Landroidx/lifecycle/LiveData;", "", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "type", "", "isFavorite", "", "lane", "(Lcom/crystalpigeon/busnovisad/model/entity/Lane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLaneClicked", "", "app_debug"})
public final class LanesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.repository.LanesRepository lanesRepository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao favLanesDao;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.repository.LanesRepository getLanesRepository() {
        return null;
    }
    
    public final void setLanesRepository(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.repository.LanesRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao getFavLanesDao() {
        return null;
    }
    
    public final void setFavLanesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane>> getLanes(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.entity.Lane lane, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object onLaneClicked(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.entity.Lane lane, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public LanesViewModel() {
        super();
    }
}