package com.hsy.api.rest.demo.services;

import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.models.*;
import com.hsy.api.rest.demo.repository.*;

import java.util.*;

public class PostService {
    //    private final PostDAO postsDtos;
    private final PostRepository postRepository;

    public PostService(

    ) {
//        this.postsDtos = new PostListDAO();
        // this.postsDtos = new PostMapDAO();
        postRepository = new PostRepository();
    }

    public List getPosts() {
        return postRepository.findAll();
    }

    public PostDTO getPostDto(String id) {
//        List<Post> post = postRepository.findAll();
//        return post.stream().map(post -> new PostDTO(post)).toList()
//        return postsDtos.find(id);
        Post post = postRepository.find(PostId.of(id));

        return new PostDTO(post);

    }

    public PostDTO createPost(PostDTO postDTO) {
//        String id = TsidCreator.getTsid().toString();
//
//
//        PostDTO newPostDto = new PostDTO();
//        newPostDto.setId(id);
//        newPostDto.setContent(postDTO.getContent());
//        newPostDto.setTitle(postDTO.getTitle());
//
//        postsDtos.save(newPostDto);
//        return postDTO;

        Post post = new Post(postDTO.getTitle(), MultilineText.of(postDTO.getContent()));

        postRepository.save(post);

        return new PostDTO(post);
    }

    public PostDTO updatePost(String id, PostDTO postdto) {
//        PostDTO found = postsDtos.find(id);
//
//        found.setTitle(postdto.getTitle());
//        found.setContent(postdto.getContent());
//
//        return found;

        Post post = postRepository.find(PostId.of(id));
        post.update(postdto.getTitle(), MultilineText.of(postdto.getContent()));

        //TODO 해당 부분이 어떻게 바로 받나 확인
        return new PostDTO(post);

    }

    public PostDTO deletePost(String id) {
//        PostDTO postDTO = postsDtos.find(id);
//        postsDtos.delete(id);
        Post post = postRepository.find(PostId.of(id));
        postRepository.delete(PostId.of(id));
        return new PostDTO(post);
    }
}
