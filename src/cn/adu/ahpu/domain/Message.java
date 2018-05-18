package cn.adu.ahpu.domain;

import java.util.Date;

public class Message {
	private String user_name;
	private String tittle;
	private String content;
	private String createDate;
	
	
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
		this.createDate = new Date().toLocaleString();
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateDate() {
		return createDate;
	}	
	
}
