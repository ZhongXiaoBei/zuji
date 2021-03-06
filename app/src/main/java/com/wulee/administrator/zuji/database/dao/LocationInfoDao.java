package com.wulee.administrator.zuji.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.wulee.administrator.zuji.database.bean.LocationInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCATION_TABLE".
*/
public class LocationInfoDao extends AbstractDao<LocationInfo, Void> {

    public static final String TABLENAME = "LOCATION_TABLE";

    /**
     * Properties of entity LocationInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property NativePhoneNumber = new Property(0, String.class, "nativePhoneNumber", false, "NATIVE_PHONE_NUMBER");
        public final static Property Lontitude = new Property(1, String.class, "lontitude", false, "LONTITUDE");
        public final static Property Latitude = new Property(2, String.class, "latitude", false, "LATITUDE");
        public final static Property Address = new Property(3, String.class, "address", false, "ADDRESS");
        public final static Property Locationdescribe = new Property(4, String.class, "locationdescribe", false, "LOCATIONDESCRIBE");
        public final static Property Time = new Property(5, Long.class, "time", false, "TIME");
        public final static Property DeviceId = new Property(6, String.class, "deviceId", false, "DEVICE_ID");
    };


    public LocationInfoDao(DaoConfig config) {
        super(config);
    }
    
    public LocationInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCATION_TABLE\" (" + //
                "\"NATIVE_PHONE_NUMBER\" TEXT," + // 0: nativePhoneNumber
                "\"LONTITUDE\" TEXT," + // 1: lontitude
                "\"LATITUDE\" TEXT," + // 2: latitude
                "\"ADDRESS\" TEXT," + // 3: address
                "\"LOCATIONDESCRIBE\" TEXT," + // 4: locationdescribe
                "\"TIME\" INTEGER," + // 5: time
                "\"DEVICE_ID\" TEXT);"); // 6: deviceId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCATION_TABLE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, LocationInfo entity) {
        stmt.clearBindings();
 
        String nativePhoneNumber = entity.getNativePhoneNumber();
        if (nativePhoneNumber != null) {
            stmt.bindString(1, nativePhoneNumber);
        }
 
        String lontitude = entity.getLontitude();
        if (lontitude != null) {
            stmt.bindString(2, lontitude);
        }
 
        String latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindString(3, latitude);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(4, address);
        }
 
        String locationdescribe = entity.getLocationdescribe();
        if (locationdescribe != null) {
            stmt.bindString(5, locationdescribe);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(6, time);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(7, deviceId);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public LocationInfo readEntity(Cursor cursor, int offset) {
        LocationInfo entity = new LocationInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // nativePhoneNumber
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // lontitude
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // latitude
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // address
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // locationdescribe
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // deviceId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, LocationInfo entity, int offset) {
        entity.setNativePhoneNumber(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setLontitude(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLatitude(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAddress(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLocationdescribe(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setDeviceId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(LocationInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(LocationInfo entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
