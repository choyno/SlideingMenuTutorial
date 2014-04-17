package com.example.slidingmenututorial.model;

public class NavDrawerItem {
	
	
	private String title;
	private int icon;
	private String count = "0";
	private boolean isCounterVisible = false;

	private void NavDrawerItem(){}
	
	public  NavDrawerItem(String title, int icon){
		this.title = title;
		this.icon = icon;
	}
	
	public NavDrawerItem(String title, int icon, boolean isCounterVisible, String count){
		this.title = title;
		this.icon = icon;
		this.count = count;
		this.isCounterVisible = isCounterVisible;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public int getIcon(){
		return this.icon;
	}
	
	public String getCount(){
		return this.count;
	}
	 
	public boolean getCounterVisible(){
		return this.isCounterVisible;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setIcon(int icon){
		this.icon = icon;
	}
	
	public void setCount(String count){
		this.count = count;
	}
	
	public void setCounterVisible(boolean isCounterVisible){
		this.isCounterVisible = isCounterVisible;
	}
	
	
	
	

}
