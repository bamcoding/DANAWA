package net.gondor.danawa.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class DanawaVO {
	private String id;
	private String subject;
	private String content;
	private long price;
	private String createdDate;
	private String displayFileName;
	private String realFileName;
	
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getDisplayFileName() {
		return displayFileName;
	}
	public void setDisplayFileName(String displayFileName) {
		if(displayFileName==null){
			displayFileName="";
		}
		this.displayFileName = displayFileName;
	}
	public String getRealFileName() {
		return realFileName;
	}
	public void setRealFileName(String realFileName) {
		if(realFileName==null){
			realFileName="";
		}
		this.realFileName = realFileName;
	}

	
}
