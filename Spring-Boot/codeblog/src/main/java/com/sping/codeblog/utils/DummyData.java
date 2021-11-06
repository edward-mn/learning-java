package com.sping.codeblog.utils;

import com.sping.codeblog.model.Post;
import com.sping.codeblog.repository.CodeblogRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

  @Autowired
  CodeblogRepository codeblogRepository;

  //@PostConstruct - Comment because always insert 2 register into BD
  public void savePosts(){
    List<Post> postList = new ArrayList<>();

    Post firstPost = new Post();
    firstPost.setAutor("Edward Moreira");
    firstPost.setData(LocalDate.now());
    firstPost.setTitulo("Docker");
    firstPost.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

    Post secondPost = new Post();
    secondPost.setAutor("Edward Moreira");
    secondPost.setData(LocalDate.now());
    secondPost.setTitulo("API REST");
    secondPost.setTexto("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");

    postList.add(firstPost);
    postList.add(secondPost);

    for(Post post: postList){
      Post postSaved = codeblogRepository.save(post);
      System.out.println("Post ID: " + postSaved.getId());
    }
  }
}
