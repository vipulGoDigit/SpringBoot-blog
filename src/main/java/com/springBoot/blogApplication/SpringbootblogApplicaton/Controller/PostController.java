package com.springBoot.blogApplication.SpringbootblogApplicaton.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.blogApplication.SpringbootblogApplicaton.Payload.PostDTO;
import com.springBoot.blogApplication.SpringbootblogApplicaton.Service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	PostService postService;
	
	public PostController(PostService postService) {
		this.postService=postService;
	}
	@PostMapping
	ResponseEntity<PostDTO>createPost(@RequestBody PostDTO postDTO){
		return new ResponseEntity<PostDTO>(postService.createPost(postDTO),HttpStatus.CREATED);
	}
	@GetMapping
	public List<PostDTO>getAllPosts(){
		return postService.getAllPosts() ;
	}
	@GetMapping("/{id}")
	ResponseEntity<PostDTO>getSpecificPost(@PathVariable Long id){
		return new ResponseEntity<>(postService.getSpecificPost(id),HttpStatus.CREATED);
	}
	@DeleteMapping("/{id}")
	public String DeletePost(@PathVariable Long id){
		return postService.DeletePost(id);
	}
	
	

}
