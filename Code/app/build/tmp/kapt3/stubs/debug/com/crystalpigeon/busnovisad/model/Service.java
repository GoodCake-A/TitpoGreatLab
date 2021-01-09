package com.crystalpigeon.busnovisad.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/crystalpigeon/busnovisad/model/Service;", "", "getBusSchedule", "Lretrofit2/Response;", "", "Lcom/crystalpigeon/busnovisad/model/ScheduleResponse;", "busNumber", "", "rv", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLanes", "Lcom/crystalpigeon/busnovisad/model/LaneResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeason", "Lcom/crystalpigeon/busnovisad/model/SeasonResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Service {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "http://www.gspns.rs/feeds/red-voznje")
    public abstract java.lang.Object getSeason(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.crystalpigeon.busnovisad.model.SeasonResponse>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "all-lanes")
    public abstract java.lang.Object getLanes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "rv")
    java.lang.String rv, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.crystalpigeon.busnovisad.model.LaneResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "all-buses/{busNumber}")
    public abstract java.lang.Object getBusSchedule(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "busNumber")
    java.lang.String busNumber, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "rv")
    java.lang.String rv, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.crystalpigeon.busnovisad.model.ScheduleResponse>>> p2);
}