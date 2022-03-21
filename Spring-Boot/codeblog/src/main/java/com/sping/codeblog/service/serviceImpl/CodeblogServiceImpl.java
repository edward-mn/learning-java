package com.sping.codeblog.service.serviceImpl;

import com.sping.codeblog.model.Post;
import com.sping.codeblog.repository.CodeblogRepository;
import com.sping.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

  @Autowired
  CodeblogRepository codeblogRepository;

  @Override
  public List<Post> findAll() {
    return codeblogRepository.findAll();
  }

  @Override
  public Post findById(long id) {
    return codeblogRepository.findById(id).get();
  }

  @Override
  public Post save(Post post) {
    return codeblogRepository.save(post);
  }

  @Override
  public void delete(long id) {
    codeblogRepository.deleteById(id);
  }
}
