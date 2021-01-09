package com.crystalpigeon.busnovisad.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u001f\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/fragment/SortFavoritesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/crystalpigeon/busnovisad/helper/OnStartDragListener;", "Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter$UpdateOrderListener;", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "job", "Lkotlinx/coroutines/CompletableJob;", "viewModel", "Lcom/crystalpigeon/busnovisad/viewmodel/SortViewModel;", "getViewModel", "()Lcom/crystalpigeon/busnovisad/viewmodel/SortViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStartDrag", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onViewCreated", "view", "updateOrder", "favorites", "", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "app_debug"})
public final class SortFavoritesFragment extends androidx.fragment.app.Fragment implements com.crystalpigeon.busnovisad.helper.OnStartDragListener, com.crystalpigeon.busnovisad.view.adapter.SortFavoritesAdapter.UpdateOrderListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private java.util.HashMap _$_findViewCache;
    
    private final com.crystalpigeon.busnovisad.viewmodel.SortViewModel getViewModel() {
        return null;
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStartDrag(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public void updateOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> favorites) {
    }
    
    public SortFavoritesFragment() {
        super();
    }
}