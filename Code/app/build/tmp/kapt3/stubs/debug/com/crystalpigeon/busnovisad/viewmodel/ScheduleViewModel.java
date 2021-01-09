package com.crystalpigeon.busnovisad.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/crystalpigeon/busnovisad/viewmodel/ScheduleViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "day", "Landroidx/lifecycle/MutableLiveData;", "", "schedule", "Landroidx/lifecycle/LiveData;", "", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "getSchedule", "()Landroidx/lifecycle/LiveData;", "scheduleRepository", "Lcom/crystalpigeon/busnovisad/model/repository/ScheduleRepository;", "getScheduleRepository", "()Lcom/crystalpigeon/busnovisad/model/repository/ScheduleRepository;", "setScheduleRepository", "(Lcom/crystalpigeon/busnovisad/model/repository/ScheduleRepository;)V", "getFavorites", "", "app_debug"})
public final class ScheduleViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.crystalpigeon.busnovisad.model.repository.ScheduleRepository scheduleRepository;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> day = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Schedule>> schedule = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.repository.ScheduleRepository getScheduleRepository() {
        return null;
    }
    
    public final void setScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.repository.ScheduleRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crystalpigeon.busnovisad.model.entity.Schedule>> getSchedule() {
        return null;
    }
    
    public final void getFavorites(@org.jetbrains.annotations.NotNull()
    java.lang.String day) {
    }
    
    public ScheduleViewModel() {
        super();
    }
}