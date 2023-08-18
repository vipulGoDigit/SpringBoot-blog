package com.springBoot.blogApplication.SpringbootblogApplicaton.Service;

import java.util.List;

import com.springBoot.blogApplication.SpringbootblogApplicaton.Payload.PostDTO;

public interface PostService {
	PostDTO createPost(PostDTO postDto);
	
	List<PostDTO>getAllPosts();
	
	PostDTO getSpecificPost(long id);


	String DeletePost(long id);
	
	
	

}
