package com.springBoot.blogApplication.SpringbootblogApplicaton.Service.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springBoot.blogApplication.SpringbootblogApplicaton.Entity.Posts;
import com.springBoot.blogApplication.SpringbootblogApplicaton.Payload.PostDTO;
import com.springBoot.blogApplication.SpringbootblogApplicaton.Repository.PostRepository;
import com.springBoot.blogApplication.SpringbootblogApplicaton.Service.PostService;
@Service
public class PostServiceImpl implements PostService {
	private PostRepository postRepository;
	
	public PostServiceImpl(PostRepository postRepository) {
		// TODO Auto-generated constructor stub
		this.postRepository=postRepository;
	}
	public Posts mapFromDto(PostDTO postDto) {
		Posts post=new Posts();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		return post;
	}
	
	public PostDTO mapFromEntity(Posts post1) {
		PostDTO postResponse=new PostDTO();
		postResponse.setId(post1.getId());
		postResponse.setTitle(post1.getTitle());
		postResponse.setContent(post1.getContent());
		postResponse.setDescription(post1.getDescription());
		return postResponse;
	}
	
	@Override
	public PostDTO createPost(PostDTO postDto) {
		
		Posts post=mapFromDto(postDto);
		
		Posts post1=  postRepository.save(post);
		PostDTO postResponse=mapFromEntity(post1);
		
		return postResponse;
		
	}
	@Override
	public List<PostDTO>getAllPosts(){
		List<Posts>post=postRepository.findAll();
		return post.stream().map(posts -> mapFromEntity(posts)).collect(Collectors.toList());
	}
	@Override
	public PostDTO getSpecificPost(long id){
		Posts post=postRepository.getReferenceById(id);
		PostDTO postResponse=mapFromEntity(post);
		return postResponse;
	}
	@Override
	public String  DeletePost(long id) {
		postRepository.deleteById(id);
		
		return "successfull deleted";
	}

}
