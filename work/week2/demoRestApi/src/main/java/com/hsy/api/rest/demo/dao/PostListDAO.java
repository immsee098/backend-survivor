package com.hsy.api.rest.demo.dao;

import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.exceptions.*;

import java.util.*;

public class PostListDAO implements PostDAO {
    private final ArrayList<PostDTO> postDtos;

    public PostListDAO() {
        this.postDtos = new ArrayList<>();
        this.postDtos.add(new PostDTO("1", "test1", "content"));
        this.postDtos.add(new PostDTO("2", "test2", "content2"));
    }


    @Override
    public List findAll() {
        // ID 순서대로 나오지는 않음
        return new ArrayList<>(postDtos);
    }

    @Override
    public PostDTO find(String id) {
        return postDtos.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst()
                .orElseThrow(PostNotFound::new);

    }

    @Override
    public void save(PostDTO postDTO) {
        postDtos.add(postDTO);
    }

    @Override
    public void delete(String id) {
        PostDTO postDTO = find(id);
        postDtos.remove(postDTO);
    }
}
