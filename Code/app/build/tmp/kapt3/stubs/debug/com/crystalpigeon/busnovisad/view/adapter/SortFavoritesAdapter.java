package com.crystalpigeon.busnovisad.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u001e\u001fB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter$ViewHolder;", "Lcom/crystalpigeon/busnovisad/helper/ItemTouchHelperAdapter;", "favorites", "", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "dragListener", "Lcom/crystalpigeon/busnovisad/helper/OnStartDragListener;", "updateOrderListener", "Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter$UpdateOrderListener;", "(Ljava/util/List;Lcom/crystalpigeon/busnovisad/helper/OnStartDragListener;Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter$UpdateOrderListener;)V", "getFavorites", "()Ljava/util/List;", "setFavorites", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemMove", "", "fromPosition", "toPosition", "UpdateOrderListener", "ViewHolder", "app_debug"})
public final class SortFavoritesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crystalpigeon.busnovisad.view.adapter.SortFavoritesAdapter.ViewHolder> implements com.crystalpigeon.busnovisad.helper.ItemTouchHelperAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> favorites;
    private final com.crystalpigeon.busnovisad.helper.OnStartDragListener dragListener = null;
    private final com.crystalpigeon.busnovisad.view.adapter.SortFavoritesAdapter.UpdateOrderListener updateOrderListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crystalpigeon.busnovisad.view.adapter.SortFavoritesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.view.adapter.SortFavoritesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public boolean onItemMove(int fromPosition, int toPosition) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> getFavorites() {
        return null;
    }
    
    public final void setFavorites(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> p0) {
    }
    
    public SortFavoritesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> favorites, @org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.helper.OnStartDragListener dragListener, @org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.view.adapter.SortFavoritesAdapter.UpdateOrderListener updateOrderListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "lane", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.crystalpigeon.busnovisad.model.entity.Lane lane) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/crystalpigeon/busnovisad/view/adapter/SortFavoritesAdapter$UpdateOrderListener;", "", "updateOrder", "", "favorites", "", "Lcom/crystalpigeon/busnovisad/model/entity/Lane;", "app_debug"})
    public static abstract interface UpdateOrderListener {
        
        public abstract void updateOrder(@org.jetbrains.annotations.NotNull()
        java.util.List<com.crystalpigeon.busnovisad.model.entity.Lane> favorites);
    }
}