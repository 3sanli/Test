package cn.sanli.entity;

import java.util.Date;

public class Message {
	private String user_name;
	private String title;
	private String content;
	private Date  createDate;
	
	
	
	public Message(String user_name, String title, String content) {
		super();
		this.user_name = user_name;
		this.title = title;
		this.content = content;
		this.createDate = new Date();
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public String getCreateDateVar() {
		return createDate.toString();
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
