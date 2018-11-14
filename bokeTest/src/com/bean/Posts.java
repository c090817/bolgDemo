package com.bean;

import java.util.Date;

public class Posts {

	
	//帖子
	Integer id;
	String title;
	String content;
	Date date;
	Integer publishId;
	String publishName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPublishId() {
		return publishId;
	}
	public void setPublishId(Integer publishId) {
		this.publishId = publishId;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	
	
}
