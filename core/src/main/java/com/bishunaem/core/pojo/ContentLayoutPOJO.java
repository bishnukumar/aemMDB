package com.bishunaem.core.pojo;

public class ContentLayoutPOJO {
	private String column1;
	private String column2;
	private String column3;
	private boolean isColumn3;
	private boolean isSingleColumn;

	public boolean isSingleColumn() {
		return isSingleColumn;
	}
	public void setSingleColumn(boolean isSingleColumn) {
		this.isSingleColumn = isSingleColumn;
	}
	
	public String getColumn1() {
		return column1;
	}
	public void setColumn1(String column1) {
		this.column1 = column1;
	}
	public String getColumn2() {
		return column2;
	}
	public void setColumn2(String column2) {
		this.column2 = column2;
	}
	public String getColumn3() {
		return column3;
	}
	public void setColumn3(String column3) {
		this.column3 = column3;
	}
	public boolean isColumn3() {
		return isColumn3;
	}
	public void setIsColumn3(boolean isColumn3) {
		this.isColumn3 = isColumn3;
	}
}
