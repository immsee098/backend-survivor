package com.hsy.api.rest.demo.services;

import com.github.f4b6a3.tsid.*;
import com.hsy.api.rest.demo.dao.*;
import com.hsy.api.rest.demo.dtos.*;

import java.util.*;

public class PostService {
    private final PostDAO postsDtos;

    public PostService(PostDAO postDAO) {
        this.postsDtos = new PostListDAO();
        // this.postsDtos = new PostMapDAO();
    }

    public List getPosts() {
        return postsDtos.findAll();
    }

    public PostDTO getPostDto(String id) {
        return postsDtos.find(id);
    }

    public PostDTO createPost(PostDTO postDTO) {
        String id = TsidCreator.getTsid().toString();

        PostDTO newPostDto = new PostDTO();
        newPostDto.setId(id);
        newPostDto.setContent(postDTO.getContent());
        newPostDto.setTitle(postDTO.getTitle());

        postsDtos.save(newPostDto);
        return postDTO;
    }

    public PostDTO updatePost(String id, PostDTO postdto) {
        PostDTO found = postsDtos.find(id);

        found.setTitle(postdto.getTitle());
        found.setContent(postdto.getContent());

        return found;

    }

    public PostDTO deletePost(String id) {
        PostDTO postDTO = postsDtos.find(id);
        postsDtos.delete(id);
        return postDTO;
    }
}
