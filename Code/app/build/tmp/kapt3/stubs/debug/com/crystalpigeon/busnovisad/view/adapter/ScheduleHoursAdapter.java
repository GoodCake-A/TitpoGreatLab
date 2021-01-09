package com.crystalpigeon.busnovisad.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J6\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J2\u0010\u0017\u001a\u00020\u00102\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u000b2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\n\u001a \u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleHoursAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleHoursAdapter$ViewHolder;", "()V", "currentHour", "", "hours", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "schedule", "Ljava/util/SortedMap;", "getCollapsedList", "hoursExpanded", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSchedule", "collapsed", "", "ViewHolder", "app_debug"})
public final class ScheduleHoursAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crystalpigeon.busnovisad.view.adapter.ScheduleHoursAdapter.ViewHolder> {
    private java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> schedule;
    private java.util.ArrayList<java.lang.String> hours;
    private int currentHour;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crystalpigeon.busnovisad.view.adapter.ScheduleHoursAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.view.adapter.ScheduleHoursAdapter.ViewHolder holder, int position) {
    }
    
    public final void setSchedule(@org.jetbrains.annotations.NotNull()
    java.util.SortedMap<java.lang.String, java.util.ArrayList<java.lang.String>> schedule, boolean collapsed) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getCollapsedList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> hoursExpanded, int currentHour) {
        return null;
    }
    
    public ScheduleHoursAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleHoursAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleHoursAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "hour", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        java.lang.String hour) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}