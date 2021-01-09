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
import com.crystalpigeon.busnovisad.model.entity.Lane;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LanesDao_Impl implements LanesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Lane> __insertionAdapterOfLane;

  private final SharedSQLiteStatement __preparedStmtOfDeleteForType;

  public LanesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLane = new EntityInsertionAdapter<Lane>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Lane` (`id`,`number`,`laneName`,`type`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lane value) {
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
        if (value.getLaneName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLaneName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
      }
    };
    this.__preparedStmtOfDeleteForType = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM lane WHERE type = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Lane lane, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLane.insert(lane);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteForType(final String type, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteForType.acquire();
        int _argIndex = 1;
        if (type == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, type);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteForType.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Lane>> getLanes(final String type) {
    final String _sql = "SELECT * FROM lane WHERE type LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"lane"}, false, new Callable<List<Lane>>() {
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
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getNonFavorites(final Continuation<? super List<Lane>> p0) {
    final String _sql = "SELECT * FROM lane WHERE id not in (SELECT f.id FROM favoriteLane f)";
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
}
