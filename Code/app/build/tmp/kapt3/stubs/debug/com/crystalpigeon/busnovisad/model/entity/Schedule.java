package com.crystalpigeon.busnovisad.model.entity;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"id", "day"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ab\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u001c\b\u0001\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b\u0012\u001c\b\u0001\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b\u0012\u001c\b\u0001\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u001d\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000bH\u00c6\u0003J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000bH\u00c6\u0003J\u00bf\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u001c\b\u0003\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b2\u001c\b\u0003\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b2\u001c\b\u0003\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00106\u001a\u000207H\u0016J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R%\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R%\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%\u00a8\u00069"}, d2 = {"Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "", "id", "", "number", "name", "lane", "directionA", "directionB", "day", "schedule", "Ljava/util/SortedMap;", "Ljava/util/ArrayList;", "scheduleA", "scheduleB", "extras", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/SortedMap;Ljava/util/SortedMap;Ljava/util/SortedMap;Ljava/lang/String;)V", "collapsed", "", "getCollapsed", "()Z", "setCollapsed", "(Z)V", "getDay", "()Ljava/lang/String;", "getDirectionA", "setDirectionA", "(Ljava/lang/String;)V", "getDirectionB", "setDirectionB", "getExtras", "setExtras", "getId", "getLane", "getName", "getNumber", "getSchedule", "()Ljava/util/SortedMap;", "getScheduleA", "getScheduleB", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Schedule {
    @androidx.room.Ignore()
    private boolean collapsed;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String number = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lane = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String directionA;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String directionB;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String day = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> schedule = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> scheduleA = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> scheduleB = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String extras;
    
    public final boolean getCollapsed() {
        return false;
    }
    
    public final void setCollapsed(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLane() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirectionA() {
        return null;
    }
    
    public final void setDirectionA(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirectionB() {
        return null;
    }
    
    public final void setDirectionB(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> getSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> getScheduleA() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> getScheduleB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtras() {
        return null;
    }
    
    public final void setExtras(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Schedule(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String number, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String lane, @org.jetbrains.annotations.Nullable()
    java.lang.String directionA, @org.jetbrains.annotations.Nullable()
    java.lang.String directionB, @org.jetbrains.annotations.NotNull()
    java.lang.String day, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {retrofit2.Converter.class})
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> schedule, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {retrofit2.Converter.class})
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> scheduleA, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {retrofit2.Converter.class})
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> scheduleB, @org.jetbrains.annotations.Nullable()
    java.lang.String extras) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crystalpigeon.busnovisad.model.entity.Schedule copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String number, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String lane, @org.jetbrains.annotations.Nullable()
    java.lang.String directionA, @org.jetbrains.annotations.Nullable()
    java.lang.String directionB, @org.jetbrains.annotations.NotNull()
    java.lang.String day, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {retrofit2.Converter.class})
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> schedule, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {retrofit2.Converter.class})
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> scheduleA, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {retrofit2.Converter.class})
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> scheduleB, @org.jetbrains.annotations.Nullable()
    java.lang.String extras) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}