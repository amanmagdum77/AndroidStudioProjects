package com.example.sqlite_employee;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.security.identity.EphemeralPublicKeyNotFoundException;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Emp.db";
    public static final String TABLE_NAME = "emp_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "First_Name";
    public static final String COL_3 = "Last_Name";
    public static final String COL_4 = "Phone";
    public static final String COL_5 = "Email";
    public static final String COL_6 = "Job_title";
    public static final String COL_7 = "Department";
    public static final String COL_8 = "Location";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+ TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "First_Name TEXT,Last_Name TEXT,Phone TEXT,Email TEXT,Job_title TEXT,Department TEXT,Location TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
    public boolean insertData(String fname,String lname,String phn,String email,String jt,String dept,String loc)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put(COL_2,fname);
        c.put(COL_3,lname);
        c.put(COL_4,phn);
        c.put(COL_5,email);
        c.put(COL_6,jt);
        c.put(COL_7,dept);
        c.put(COL_8,loc);
        long result = db.insert(TABLE_NAME,null,c);
        if(result == -1)
            return false;
        else
            return true;

    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public Integer deletedata(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"ID=?",new String[]{id});
    }

    public boolean updatedata(String id,String fname,String lname,String phn,String email,String jt,String dept,String loc)
    {
        int i;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c= new ContentValues();
        c.put(COL_1,id);
        c.put(COL_2,fname);
        c.put(COL_3,lname);
        c.put(COL_4,phn);
        c.put(COL_5,email);
        c.put(COL_6,jt);
        c.put(COL_7,dept);
        c.put(COL_8,loc);
        i = db.update(TABLE_NAME,c,"id=?",new String[]{id});
        if(i>0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
