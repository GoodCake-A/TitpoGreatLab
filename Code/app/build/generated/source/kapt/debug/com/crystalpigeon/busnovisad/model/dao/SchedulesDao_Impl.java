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
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.crystalpigeon.busnovisad.model.Converters;
import com.crystalpigeon.busnovisad.model.entity.Schedule;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SchedulesDao_Impl implements SchedulesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Schedule> __insertionAdapterOfSchedule;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllSchedules;

  public SchedulesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSchedule = new EntityInsertionAdapter<Schedule>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Schedule` (`id`,`number`,`name`,`lane`,`directionA`,`directionB`,`day`,`schedule`,`scheduleA`,`scheduleB`,`extras`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Schedule value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNumber());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getLane() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLane());
        }
        if (value.getDirectionA() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDirectionA());
        }
        if (value.getDirectionB() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDirectionB());
        }
        if (value.getDay() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDay());
        }
        final String _tmp;
        _tmp = __converters.fromLinkedHashMap(value.getSchedule());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.fromLinkedHashMap(value.getScheduleA());
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converters.fromLinkedHashMap(value.getScheduleB());
        if (_tmp_2 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_2);
        }
        if (value.getExtras() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getExtras());
        }
      }
    };
    this.__preparedStmtOfDeleteAllSchedules = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM schedule";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Schedule schedule, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSchedule.insert(schedule);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteAllSchedules() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllSchedules.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllSchedules.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Schedule>> getSchedulesByDay(final String day) {
    final String _sql = "SELECT * FROM schedule WHERE day LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (day == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, day);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"schedule"}, false, new Callable<List<Schedule>>() {
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

  @Override
  public LiveData<List<Schedule>> getSchedulesByDayAndLanes(final String day,
      final List<String> ids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT ");
    _stringBuilder.append("*");
    _stringBuilder.append(" FROM schedule WHERE day LIKE ");
    _stringBuilder.append("?");
    _stringBuilder.append(" and id in (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 1 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    if (day == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, day);
    }
    _argIndex = 2;
    for (String _item : ids) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"schedule"}, false, new Callable<List<Schedule>>() {
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
            final Schedule _item_1;
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
            _item_1 = new Schedule(_tmpId,_tmpNumber,_tmpName,_tmpLane,_tmpDirectionA,_tmpDirectionB,_tmpDay,_tmpSchedule,_tmpScheduleA,_tmpScheduleB,_tmpExtras);
            _result.add(_item_1);
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

  @Override
  public Object getNumberOfRows(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT count(*) FROM schedule";
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
}
