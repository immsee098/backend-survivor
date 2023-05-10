package com.hsy.api.rest.demo.services;

import com.hsy.api.rest.demo.*;
import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.models.*;
import com.hsy.api.rest.demo.repository.*;
import org.springframework.stereotype.*;

@Service
public class GetPostDTOListService {

    private final PostRepository postRepository;

    public GetPostDTOListService() {
        this.postRepository = Factory.postRepository();
    }

    public PostDTO getPostDto(String id) {

        Post post = postRepository.find(PostId.of(id));

        return new PostDTO(post);

    }
}
