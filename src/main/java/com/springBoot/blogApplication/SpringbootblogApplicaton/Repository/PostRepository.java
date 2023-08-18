package com.springBoot.blogApplication.SpringbootblogApplicaton.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.blogApplication.SpringbootblogApplicaton.Entity.Posts;

public interface PostRepository extends JpaRepository<Posts,Long>{

}
