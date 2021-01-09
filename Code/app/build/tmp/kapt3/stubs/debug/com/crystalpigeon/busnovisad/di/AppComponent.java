package com.crystalpigeon.busnovisad.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lcom/crystalpigeon/busnovisad/di/AppComponent;", "", "inject", "", "lanesRepository", "Lcom/crystalpigeon/busnovisad/model/repository/LanesRepository;", "repository", "Lcom/crystalpigeon/busnovisad/model/repository/ScheduleRepository;", "seasonRepository", "Lcom/crystalpigeon/busnovisad/model/repository/SeasonRepository;", "mainActivity", "Lcom/crystalpigeon/busnovisad/view/MainActivity;", "settingsFragment", "Lcom/crystalpigeon/busnovisad/view/fragment/SettingsFragment;", "lanesViewModel", "Lcom/crystalpigeon/busnovisad/viewmodel/LanesViewModel;", "mainViewModel", "Lcom/crystalpigeon/busnovisad/viewmodel/MainViewModel;", "scheduleViewModel", "Lcom/crystalpigeon/busnovisad/viewmodel/ScheduleViewModel;", "sortViewModel", "Lcom/crystalpigeon/busnovisad/viewmodel/SortViewModel;", "app_debug"})
@dagger.Component(modules = {com.crystalpigeon.busnovisad.di.AppModule.class, com.crystalpigeon.busnovisad.di.NetworkModule.class, com.crystalpigeon.busnovisad.di.StorageModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.repository.SeasonRepository seasonRepository);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.repository.LanesRepository lanesRepository);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.view.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.viewmodel.LanesViewModel lanesViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.model.repository.ScheduleRepository repository);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.viewmodel.MainViewModel mainViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.view.fragment.SettingsFragment settingsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.viewmodel.SortViewModel sortViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crystalpigeon.busnovisad.viewmodel.ScheduleViewModel scheduleViewModel);
}