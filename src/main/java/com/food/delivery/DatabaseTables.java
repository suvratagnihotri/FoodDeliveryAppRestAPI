package com.food.delivery;

public class DatabaseTables {
	static String menuTableName;
	public static void setTableName(String tableName) {
		menuTableName = tableName;
	}
	public static String getTableName() {
		return menuTableName;
	}
}
