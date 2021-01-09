package com.crystalpigeon.busnovisad.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao;
import com.crystalpigeon.busnovisad.model.dao.FavoriteLanesDao_Impl;
import com.crystalpigeon.busnovisad.model.dao.LanesDao;
import com.crystalpigeon.busnovisad.model.dao.LanesDao_Impl;
import com.crystalpigeon.busnovisad.model.dao.SchedulesDao;
import com.crystalpigeon.busnovisad.model.dao.SchedulesDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BusDatabase_Impl extends BusDatabase {
  private volatile LanesDao _lanesDao;

  private volatile FavoriteLanesDao _favoriteLanesDao;

  private volatile SchedulesDao _schedulesDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Lane` (`id` TEXT NOT NULL, `number` TEXT, `laneName` TEXT, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Schedule` (`id` TEXT NOT NULL, `number` TEXT, `name` TEXT, `lane` TEXT, `directionA` TEXT, `directionB` TEXT, `day` TEXT NOT NULL, `schedule` TEXT, `scheduleA` TEXT, `scheduleB` TEXT, `extras` TEXT, PRIMARY KEY(`id`, `day`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `FavoriteLane` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `sort` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '855a86da63780b077ff3396e0de6b450')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Lane`");
        _db.execSQL("DROP TABLE IF EXISTS `Schedule`");
        _db.execSQL("DROP TABLE IF EXISTS `FavoriteLane`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLane = new HashMap<String, TableInfo.Column>(4);
        _columnsLane.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLane.put("number", new TableInfo.Column("number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLane.put("laneName", new TableInfo.Column("laneName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLane.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLane = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLane = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLane = new TableInfo("Lane", _columnsLane, _foreignKeysLane, _indicesLane);
        final TableInfo _existingLane = TableInfo.read(_db, "Lane");
        if (! _infoLane.equals(_existingLane)) {
          return new RoomOpenHelper.ValidationResult(false, "Lane(com.crystalpigeon.busnovisad.model.entity.Lane).\n"
                  + " Expected:\n" + _infoLane + "\n"
                  + " Found:\n" + _existingLane);
        }
        final HashMap<String, TableInfo.Column> _columnsSchedule = new HashMap<String, TableInfo.Column>(11);
        _columnsSchedule.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("number", new TableInfo.Column("number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("lane", new TableInfo.Column("lane", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("directionA", new TableInfo.Column("directionA", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("directionB", new TableInfo.Column("directionB", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("day", new TableInfo.Column("day", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("schedule", new TableInfo.Column("schedule", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("scheduleA", new TableInfo.Column("scheduleA", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("scheduleB", new TableInfo.Column("scheduleB", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedule.put("extras", new TableInfo.Column("extras", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSchedule = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSchedule = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSchedule = new TableInfo("Schedule", _columnsSchedule, _foreignKeysSchedule, _indicesSchedule);
        final TableInfo _existingSchedule = TableInfo.read(_db, "Schedule");
        if (! _infoSchedule.equals(_existingSchedule)) {
          return new RoomOpenHelper.ValidationResult(false, "Schedule(com.crystalpigeon.busnovisad.model.entity.Schedule).\n"
                  + " Expected:\n" + _infoSchedule + "\n"
                  + " Found:\n" + _existingSchedule);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteLane = new HashMap<String, TableInfo.Column>(3);
        _columnsFavoriteLane.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteLane.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteLane.put("sort", new TableInfo.Column("sort", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteLane = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteLane = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteLane = new TableInfo("FavoriteLane", _columnsFavoriteLane, _foreignKeysFavoriteLane, _indicesFavoriteLane);
        final TableInfo _existingFavoriteLane = TableInfo.read(_db, "FavoriteLane");
        if (! _infoFavoriteLane.equals(_existingFavoriteLane)) {
          return new RoomOpenHelper.ValidationResult(false, "FavoriteLane(com.crystalpigeon.busnovisad.model.entity.FavoriteLane).\n"
                  + " Expected:\n" + _infoFavoriteLane + "\n"
                  + " Found:\n" + _existingFavoriteLane);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "855a86da63780b077ff3396e0de6b450", "46b1bc32b1d8dbb9a3ecbaafd84c4b50");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Lane","Schedule","FavoriteLane");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Lane`");
      _db.execSQL("DELETE FROM `Schedule`");
      _db.execSQL("DELETE FROM `FavoriteLane`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public LanesDao lanesDao() {
    if (_lanesDao != null) {
      return _lanesDao;
    } else {
      synchronized(this) {
        if(_lanesDao == null) {
          _lanesDao = new LanesDao_Impl(this);
        }
        return _lanesDao;
      }
    }
  }

  @Override
  public FavoriteLanesDao favLanesDao() {
    if (_favoriteLanesDao != null) {
      return _favoriteLanesDao;
    } else {
      synchronized(this) {
        if(_favoriteLanesDao == null) {
          _favoriteLanesDao = new FavoriteLanesDao_Impl(this);
        }
        return _favoriteLanesDao;
      }
    }
  }

  @Override
  public SchedulesDao schedulesDao() {
    if (_schedulesDao != null) {
      return _schedulesDao;
    } else {
      synchronized(this) {
        if(_schedulesDao == null) {
          _schedulesDao = new SchedulesDao_Impl(this);
        }
        return _schedulesDao;
      }
    }
  }
}
