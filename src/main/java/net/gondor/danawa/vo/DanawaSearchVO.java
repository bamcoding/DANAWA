package net.gondor.danawa.vo;

public class DanawaSearchVO {
	private int pageNumber;
	private int startNumber;
	private int endNumber;
	
	private String keyword;
	private int startPrice;
	private int endPrice;
	
	private String align;
	
	
	public String getAlign() {
		return align;
	}
	public void setAlign(String align) {
		this.align = align;
	}
	public int getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(int startPrice) {
		this.startPrice = startPrice;
	}
	public int getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(int endPrice) {
		this.endPrice = endPrice;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getStartNumber() {
		return startNumber;
	}
	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}
	public int getEndNumber() {
		return endNumber;
	}
	public void setEndNumber(int endNumber) {
		this.endNumber = endNumber;
	}

	
}
