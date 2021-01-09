package com.crystalpigeon.busnovisad.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0011\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\'J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\tH\'J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/crystalpigeon/busnovisad/model/dao/SchedulesDao;", "", "deleteAllSchedules", "", "getNumberOfRows", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchedulesByDay", "Landroidx/lifecycle/LiveData;", "", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "day", "", "getSchedulesByDayAndLanes", "ids", "insert", "schedule", "(Lcom/crystalpigeon/busnovisad/model/entity/Schedule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SchedulesDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM schedule WHERE day LIKE :day")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Schedule>> getSchedulesByDay(@org.jetbrains.annotations.NotNull()
    java.lang.String day);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM schedule WHERE day LIKE :day and id in (:ids)")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Schedule>> getSchedulesByDayAndLanes(@org.jetbrains.annotations.NotNull()
    java.lang.String day, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ids);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT count(*) FROM schedule")
    public abstract java.lang.Object getNumberOfRows(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.entity.Schedule schedule, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Query(value = "DELETE FROM schedule")
    public abstract void deleteAllSchedules();
}