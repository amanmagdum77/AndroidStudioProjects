package com.example.contentprovider1;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.HashMap;
public class UserProvider extends ContentProvider{
        static final String PROVIDER_NAME = "com.example.contentprovider1.UserProvider";
        static final String URL = "content://" + PROVIDER_NAME + "/users";
        static final Uri CONTENT_URI = Uri.parse URL;

        static final String id = "id";
        static final String name = "name";
        static final int uriCode = 1;
        static final (UriMatcher uriMatcher);
        private static HashMap (String, String values);
        static {
            uriMatcher = new UriMatcher UriMatcher.NO_MATCH;
            uriMatcher.addURI PROVIDER_NAME, "users", uriCode;
            uriMatcher.addURI PROVIDER_NAME, "users/*", uriCode;
        }

@Override
public String getType (Uri uri)

    {
        switch uriMatcher.match uri
        case uriCode:
            return "vnd.android.cursor.dir/users";
        default:
            throw new IllegalArgumentException "Unsupported URI: " + uri;
    }


@Override
public boolean onCreate

    {
        Context context = getContext;
        DatabaseHelper dbHelper = new DatabaseHelper context;
        db = dbHelper.getWritableDatabase;
        if db != null
        return true;

        return false;
    }


@Override
public Cursor query Uri uri, String[] projection, String selection,
        String[] selectionArgs, String sortOrder
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder ;
        qb.setTables TABLE_NAME ;

        switch uriMatcher.match uri
        case uriCode:
        qb.setProjectionMap values;
        break;
default:
        throw new IllegalArgumentException "Unknown URI " + uri ;

        if sortOrder == null || sortOrder == ""
        sortOrder = id;

        Cursor c = qb.query db, projection, selection, selectionArgs, null,
        null, sortOrder;
        c.setNotificationUri getContext .getContentResolver, uri;
        return c;



@Override

default:
        throw new IllegalArgumentException "Unknown URI " + uri ;

        getContext .getContentResolver .notifyChange uri, null;
        return count;

@Override
public int delete Uri uri, String selection, String[] selectionArgs
        int count = 0;
        switch uriMatcher.match uri
        case uriCode:
        count = db.delete TABLE_NAME, selection, selectionArgs ;
        break;
default:
        throw new IllegalArgumentException "Unknown URI " + uri ;

        getContext .getContentResolver .notifyChange uri, null ;
        return count;

private SQLiteDatabase db;
static final String DATABASE_NAME = "EmpDB";
static final String TABLE_NAME = "Employees";
static final int DATABASE_VERSION = 1;
static final String CREATE_DB_TABLE = " CREATE TABLE " + TABLE_NAME
        + " id INTEGER PRIMARY KEY AUTOINCREMENT, "
        + " name TEXT NOT NULL;"