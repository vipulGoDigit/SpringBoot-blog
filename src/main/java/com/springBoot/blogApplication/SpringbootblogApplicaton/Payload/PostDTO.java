package com.springBoot.blogApplication.SpringbootblogApplicaton.Payload;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostDTO {
	Long id;
	String title;
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getContent() {
		return content;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setContent(String content) {
		this.content = content;
	}
	String description;
	String content;

}
