package com.crystalpigeon.busnovisad.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006/"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/fragment/ScheduleFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter$OnScheduleClicked;", "()V", "day", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "scheduleAdapter", "Lcom/crystalpigeon/busnovisad/view/adapter/ScheduleAdapter;", "scheduleVM", "Lcom/crystalpigeon/busnovisad/viewmodel/ScheduleViewModel;", "getScheduleVM", "()Lcom/crystalpigeon/busnovisad/viewmodel/ScheduleViewModel;", "scheduleVM$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/crystalpigeon/busnovisad/viewmodel/MainViewModel;", "getViewModel", "()Lcom/crystalpigeon/busnovisad/viewmodel/MainViewModel;", "viewModel$delegate", "formattedExtras", "extras", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onScheduleClicked", "schedule", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "position", "", "onViewCreated", "view", "translateDirection", "direction", "Companion", "app_debug"})
public final class ScheduleFragment extends androidx.fragment.app.Fragment implements com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter.OnScheduleClicked {
    private final kotlin.Lazy scheduleVM$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.crystalpigeon.busnovisad.view.adapter.ScheduleAdapter scheduleAdapter;
    private java.lang.String day;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController;
    public static final com.crystalpigeon.busnovisad.view.fragment.ScheduleFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.crystalpigeon.busnovisad.viewmodel.ScheduleViewModel getScheduleVM() {
        return null;
    }
    
    private final com.crystalpigeon.busnovisad.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String formattedExtras(java.lang.String extras) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onScheduleClicked(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.entity.Schedule schedule, int position) {
    }
    
    private final java.lang.String translateDirection(java.lang.String direction) {
        return null;
    }
    
    public ScheduleFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/fragment/ScheduleFragment$Companion;", "", "()V", "newInstance", "Lcom/crystalpigeon/busnovisad/view/fragment/ScheduleFragment;", "day", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.crystalpigeon.busnovisad.view.fragment.ScheduleFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String day) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}