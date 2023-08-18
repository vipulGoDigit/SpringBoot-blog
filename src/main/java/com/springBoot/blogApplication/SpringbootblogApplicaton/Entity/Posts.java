package com.springBoot.blogApplication.SpringbootblogApplicaton.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Posts")


public class Posts {
	
	
	
	@Id
	@GeneratedValue(
			
				strategy = GenerationType.IDENTITY 
			
	)
	
	Long id;
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
	@Column(name="title")
	String title;
	@Column(name="description")
	String description;
	@Column(name="content")
	String content;

}
