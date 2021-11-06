package com.sping.codeblog.service;

import com.sping.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {
  List<Post> findAll();
  Post findById(long id);
  Post save(Post post);
}
