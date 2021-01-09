package com.crystalpigeon.busnovisad.model.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.crystalpigeon.busnovisad.model.Converters;
import com.crystalpigeon.busnovisad.model.entity.FavoriteLane;
import com.crystalpigeon.busnovisad.model.entity.Lane;
import com.crystalpigeon.busnovisad.model.entity.Schedule;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteLanesDao_Impl implements FavoriteLanesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteLane> __insertionAdapterOfFavoriteLane;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFavLane;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrder;

  private final Converters __converters = new Converters();

  public FavoriteLanesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteLane = new EntityInsertionAdapter<FavoriteLane>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `FavoriteLane` (`id`,`type`,`sort`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteLane value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        stmt.bindLong(3, value.getSort());
      }
    };
    this.__preparedStmtOfDeleteFavLane = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favoriteLane WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE favoriteLane SET sort = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertFavLane(final FavoriteLane favLane, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteLane.insert(favLane);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteFavLane(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFavLane.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteFavLane.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public void updateOrder(final String id, final int sort) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrder.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, sort);
    _argIndex = 2;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateOrder.release(_stmt);
    }
  }

  @Override
  public Object getFavLane(final String id, final Continuation<? super List<FavoriteLane>> p1) {
    final String _sql = "SELECT * FROM favoriteLane WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<FavoriteLane>>() {
      @Override
      public List<FavoriteLane> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfSort = CursorUtil.getColumnIndexOrThrow(_cursor, "sort");
          final List<FavoriteLane> _result = new ArrayList<FavoriteLane>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavoriteLane _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final int _tmpSort;
            _tmpSort = _cursor.getInt(_cursorIndexOfSort);
            _item = new FavoriteLane(_tmpId,_tmpType,_tmpSort);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getFavLanes(final Continuation<? super List<Lane>> p0) {
    final String _sql = "SELECT l.* FROM favoriteLane f inner join lane l on f.id = l.id ORDER BY sort ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Lane>>() {
      @Override
      public List<Lane> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfLaneName = CursorUtil.getColumnIndexOrThrow(_cursor, "laneName");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final List<Lane> _result = new ArrayList<Lane>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Lane _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpNumber;
            _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
            final String _tmpLaneName;
            _tmpLaneName = _cursor.getString(_cursorIndexOfLaneName);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            _item = new Lane(_tmpId,_tmpNumber,_tmpLaneName,_tmpType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getBiggestOrder(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT MAX(sort) + 1 FROM favoriteLane";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<Schedule>> getFavoritesByDay(final String day) {
    final String _sql = "SELECT s.* FROM favoriteLane f INNER JOIN schedule s ON f.id = s.id WHERE s.day = ? ORDER BY sort ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (day == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, day);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"favoriteLane","schedule"}, false, new Callable<List<Schedule>>() {
      @Override
      public List<Schedule> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfLane = CursorUtil.getColumnIndexOrThrow(_cursor, "lane");
          final int _cursorIndexOfDirectionA = CursorUtil.getColumnIndexOrThrow(_cursor, "directionA");
          final int _cursorIndexOfDirectionB = CursorUtil.getColumnIndexOrThrow(_cursor, "directionB");
          final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
          final int _cursorIndexOfSchedule = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule");
          final int _cursorIndexOfScheduleA = CursorUtil.getColumnIndexOrThrow(_cursor, "scheduleA");
          final int _cursorIndexOfScheduleB = CursorUtil.getColumnIndexOrThrow(_cursor, "scheduleB");
          final int _cursorIndexOfExtras = CursorUtil.getColumnIndexOrThrow(_cursor, "extras");
          final List<Schedule> _result = new ArrayList<Schedule>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Schedule _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpNumber;
            _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpLane;
            _tmpLane = _cursor.getString(_cursorIndexOfLane);
            final String _tmpDirectionA;
            _tmpDirectionA = _cursor.getString(_cursorIndexOfDirectionA);
            final String _tmpDirectionB;
            _tmpDirectionB = _cursor.getString(_cursorIndexOfDirectionB);
            final String _tmpDay;
            _tmpDay = _cursor.getString(_cursorIndexOfDay);
            final SortedMap<String, ArrayList<String>> _tmpSchedule;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfSchedule);
            _tmpSchedule = __converters.fromString(_tmp);
            final SortedMap<String, ArrayList<String>> _tmpScheduleA;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfScheduleA);
            _tmpScheduleA = __converters.fromString(_tmp_1);
            final SortedMap<String, ArrayList<String>> _tmpScheduleB;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfScheduleB);
            _tmpScheduleB = __converters.fromString(_tmp_2);
            final String _tmpExtras;
            _tmpExtras = _cursor.getString(_cursorIndexOfExtras);
            _item = new Schedule(_tmpId,_tmpNumber,_tmpName,_tmpLane,_tmpDirectionA,_tmpDirectionB,_tmpDay,_tmpSchedule,_tmpScheduleA,_tmpScheduleB,_tmpExtras);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
