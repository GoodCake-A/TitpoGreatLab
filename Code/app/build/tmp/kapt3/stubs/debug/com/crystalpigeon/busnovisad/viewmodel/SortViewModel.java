package com.crystalpigeon.busnovisad.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/crystalpigeon/busnovisad/viewmodel/SortViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "favoriteLanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "getFavoriteLanesDao", "()Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "setFavoriteLanesDao", "(Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;)V", "getAllFavorites", "", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "", "favorites", "app_debug"})
public final class SortViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao favoriteLanesDao;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao getFavoriteLanesDao() {
        return null;
    }
    
    public final void setFavoriteLanesDao(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane>> p0) {
        return null;
    }
    
    public final void updateOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> favorites) {
    }
    
    public SortViewModel() {
        super();
    }
}