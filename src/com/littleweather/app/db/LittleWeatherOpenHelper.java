package com.littleweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class LittleWeatherOpenHelper extends SQLiteOpenHelper {
	
	public static final String CREATE_SYS_DICTIONARYITEM = "create table Sys_Dictionary ("+
			"Id integer primary key autoincrement, "+
			"ItemId CHAR(5) NOT NULL,"+
			"ItemCode VARCHAR(100) NOT NULL,"+
			"ItemName NVARCHAR(100),"+
			"ParentId CHAR(5) )";
	
	public LittleWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_SYS_DICTIONARYITEM);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}
