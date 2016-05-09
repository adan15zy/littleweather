package com.littleweather.app.model;

import java.util.ArrayList;
import java.util.List;

import com.littleweather.app.db.LittleWeatherOpenHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class LittleWeatherDB {
	
	public static final String DB_NAME="little_weather";
	
	public static final int VERSION=1;
	
	private static LittleWeatherDB littleWeatherDB;
	private SQLiteDatabase db;
	
	private LittleWeatherDB(Context context){
		LittleWeatherOpenHelper littleWeatherOpenHelper = new LittleWeatherOpenHelper(context, DB_NAME, null, VERSION);
		db = littleWeatherOpenHelper.getWritableDatabase();
	}
	
	/*
	 * »ñÈ¡littleweatherdbÊµÀý
	*/
	public synchronized static LittleWeatherDB getInstanse(Context context) {
		if (littleWeatherDB==null) {
			littleWeatherDB = new LittleWeatherDB(context);
		}
		
		return littleWeatherDB;
	}
	
	public void saveDictionay(Sys_Dictionary sys_Dictionary) {
		if (sys_Dictionary!=null) {
			String strSql = "insert into Sys_Dictionary (ItemId,ItemCode,ItemName,ParentId) values(?,?,?,?)";
			Object[] args = new Object[]{sys_Dictionary.getItemId(),sys_Dictionary.getItemCode(),sys_Dictionary.getItemName(),sys_Dictionary.getParentId()};
			db.execSQL(strSql, args);
		}
	}
	
	public List<Sys_Dictionary> loadSys_Dictionaries(String itemCode) {
		List<Sys_Dictionary> dictionaries = new ArrayList<Sys_Dictionary>();
		
		String strSql = "select * From Sys_Dictionary where itemcode=?";
		Cursor cursor = db.rawQuery(strSql, new String[]{itemCode});
		if (cursor.moveToNext()) {
			do{
				Sys_Dictionary dic = new Sys_Dictionary();
				dic.setId(cursor.getInt(cursor.getColumnIndex("Id")));
				dic.setItemId(cursor.getString(cursor.getColumnIndex("itemId")));
				dic.setId(cursor.getInt(cursor.getColumnIndex("Id")));
				dic.setId(cursor.getInt(cursor.getColumnIndex("Id")));
			}
			while(cursor.moveToNext());
		}
		
		return dictionaries;
	}
	
}
