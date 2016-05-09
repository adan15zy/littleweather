package com.littleweather.app.model;

import android.R.string;

public class Sys_Dictionary {
	
	private int Id ;
	private String ItemId;
	private String ItemCode;
	private String ItemName;
	private String ParentId;
	
	public void setId(int id) {
		this.Id = id;
	}
	public int getId() {
		return Id;
	}
	
	public void setItemId(String itemId) {
		this.ItemId = ItemId;
	}
	public String getItemId() {
		return ItemId;
	}
	
	public void setItemCode(String ItemCode) {
		this.ItemCode = ItemCode;
	}
	public String getItemCode() {
		return ItemCode;
	}
	
	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	public String getItemName() {
		return ItemName;
	}
	
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public String getParentId() {
		return ParentId;
	}
}
