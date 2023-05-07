package com.hsy.api.rest.demo.dao;

import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.exceptions.*;

import java.util.*;

public class PostMapDAO implements PostDAO {
    private Map<String, PostDTO> postDtos;

    public PostMapDAO() {
        this.postDtos = new HashMap<>();
        this.postDtos.put("1", new PostDTO("1", "test1", "content"));
        this.postDtos.put("2", new PostDTO("2", "test2", "content2"));
    }


    @Override
    public List findAll() {
        // ID 순서대로 나오지는 않음
        return new ArrayList<>(postDtos.values());
    }

    @Override
    public PostDTO find(String id) {
        PostDTO postDTO = postDtos.get(id);
        if (postDTO == null) {
            throw new PostNotFound();
        }
        return postDTO;
    }

    @Override
    public void save(PostDTO postDTO) {
        postDtos.put(postDTO.getId(), postDTO);
    }

    @Override
    public void delete(String id) {
        postDtos.remove(id);
    }
}
