package com.crystalpigeon.busnovisad.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004%&\'(B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u0016J\u001e\u0010$\u001a\u00020\u001d2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006)"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "schedules", "Ljava/util/ArrayList;", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onScheduleClicked", "Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;)V", "getContext", "()Landroid/content/Context;", "loading", "", "getOnScheduleClicked", "()Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;", "setOnScheduleClicked", "(Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;)V", "getSchedules", "()Ljava/util/ArrayList;", "setSchedules", "(Ljava/util/ArrayList;)V", "getItemCount", "", "getItemViewType", "position", "loadingStarted", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSchedule", "Companion", "LoaderHolder", "OnScheduleClicked", "ViewHolder", "app_debug"})
public final class ScheduleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private boolean loading;
    @org.jetbrains.annotations.Nullable()
    private com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked onScheduleClicked;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> schedules;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final int LOADER = 1;
    private static final int SCHEDULE = 2;
    public static final com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked getOnScheduleClicked() {
        return null;
    }
    
    public final void setOnScheduleClicked(@org.jetbrains.annotations.Nullable()
    com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void loadingStarted(boolean loading) {
    }
    
    public final void updateSchedule(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> schedules) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> getSchedules() {
        return null;
    }
    
    public final void setSchedules(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public ScheduleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> schedules, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked onScheduleClicked) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$LoaderHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "app_debug"})
    public final class LoaderHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public LoaderHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "onScheduleClicked", "Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;", "(Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter;Landroid/view/View;Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;)V", "scheduleAAdapter", "Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleHoursAdapter;", "scheduleBAdapter", "getView", "()Landroid/view/View;", "bind", "", "schedule", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.crystalpigeon.busnovisad.view.adapter.ScheduleHoursAdapter scheduleAAdapter = null;
        private final com.crystalpigeon.busnovisad.view.adapter.ScheduleHoursAdapter scheduleBAdapter = null;
        private com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked onScheduleClicked;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.crystalpigeon.busnovisad.model.entity.Schedule schedule) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked onScheduleClicked) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;", "", "onScheduleClicked", "", "schedule", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "position", "", "app_debug"})
    public static abstract interface OnScheduleClicked {
        
        public abstract void onScheduleClicked(@org.jetbrains.annotations.NotNull()
        com.crystalpigeon.busnovisad.model.entity.Schedule schedule, int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$Companion;", "", "()V", "LOADER", "", "SCHEDULE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}