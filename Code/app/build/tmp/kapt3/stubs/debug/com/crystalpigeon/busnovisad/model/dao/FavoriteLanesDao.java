package com.crystalpigeon.busnovisad.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\'J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "", "deleteFavLane", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBiggestOrder", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavLane", "", "Lcom/crystalpigeon/busnovisad/model/entity/FavoriteLane;", "getFavLanes", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "getFavoritesByDay", "Landroidx/lifecycle/LiveData;", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "day", "insertFavLane", "favLane", "(Lcom/crystalpigeon/busnovisad/model/entity/FavoriteLane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "sort", "app_debug"})
public abstract interface FavoriteLanesDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM favoriteLane WHERE id = :id")
    public abstract java.lang.Object getFavLane(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crystalpigeon.busnovisad.model.entity.FavoriteLane>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT l.* FROM favoriteLane f inner join lane l on f.id = l.id ORDER BY sort ASC")
    public abstract java.lang.Object getFavLanes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM favoriteLane WHERE id = :id")
    public abstract java.lang.Object deleteFavLane(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertFavLane(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.entity.FavoriteLane favLane, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT MAX(sort) + 1 FROM favoriteLane")
    public abstract java.lang.Object getBiggestOrder(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @androidx.room.Query(value = "UPDATE favoriteLane SET sort = :sort WHERE id = :id")
    public abstract void updateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int sort);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT s.* FROM favoriteLane f INNER JOIN schedule s ON f.id = s.id WHERE s.day = :day ORDER BY sort ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Schedule>> getFavoritesByDay(@org.jetbrains.annotations.NotNull()
    java.lang.String day);
}