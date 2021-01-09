package com.crystalpigeon.busnovisad.model;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.crystalpigeon.busnovisad.model.Converters.class})
@androidx.room.Database(entities = {com.crystalpigeon.busnovisad.model.entity.Lane.class, com.crystalpigeon.busnovisad.model.entity.Schedule.class, com.crystalpigeon.busnovisad.model.entity.FavoriteLane.class}, version = 5, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/crystalpigeon/busnovisad/model/BusDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favLanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/FavoriteLanesDao;", "lanesDao", "Lcom/crystalpigeon/busnovisad/model/dao/LanesDao;", "schedulesDao", "Lcom/crystalpigeon/busnovisad/model/dao/SchedulesDao;", "app_debug"})
public abstract class BusDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crystalpigeon.busnovisad.model.dao.LanesDao lanesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao favLanesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crystalpigeon.busnovisad.model.dao.SchedulesDao schedulesDao();
    
    public BusDatabase() {
        super();
    }
}