package com.crystalpigeon.busnovisad;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/crystalpigeon/busnovisad/ScheduleDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldSchdules", "Ljava/util/ArrayList;", "Lcom/crystalpigeon/busnovisad/model/entity/Schedule;", "Lkotlin/collections/ArrayList;", "newSchedules", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getNewSchedules", "()Ljava/util/ArrayList;", "getOldSchdules", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_debug"})
public final class ScheduleDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> oldSchdules = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> newSchedules = null;
    
    @java.lang.Override()
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override()
    public int getOldListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> getOldSchdules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> getNewSchedules() {
        return null;
    }
    
    public ScheduleDiffUtil(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> oldSchdules, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crystalpigeon.busnovisad.model.entity.Schedule> newSchedules) {
        super();
    }
}