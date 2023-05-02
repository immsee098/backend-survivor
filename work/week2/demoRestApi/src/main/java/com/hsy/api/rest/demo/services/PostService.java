package com.hsy.api.rest.demo.services;

import com.github.f4b6a3.tsid.*;
import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.exceptions.*;

import java.util.*;

public class PostService {
    private List<PostDTO> postsDtos = new ArrayList<>(List.of(
            new PostDTO("1", "test1", "content"),
            new PostDTO("2", "test2", "content")
    ));

    public List getPosts() {
        return postsDtos;
    }

    public PostDTO getPostDto(String id) {
        return findPostDto(id);
    }

    public PostDTO createPost(PostDTO postDTO) {
        String id = TsidCreator.getTsid().toString();
        postDTO.setId(id);
        postsDtos.add(postDTO);
        return postDTO;
    }

    public PostDTO updatePost(String id, PostDTO postdto) {
        PostDTO found = findPostDto(id);
        found.setTitle(postdto.getTitle());
        found.setContent(postdto.getContent());

        return found;

    }

    private PostDTO findPostDto(String id) {
        return postsDtos.stream().filter(postDTO -> postDTO.getId().equals(id))
                .findFirst()
                .orElseThrow(PostNotFound::new);
    }

    public PostDTO deletePost(String id) {
        PostDTO postDTO = findPostDto(id);
        postsDtos.remove(postDTO);
        return postDTO;
    }
}
