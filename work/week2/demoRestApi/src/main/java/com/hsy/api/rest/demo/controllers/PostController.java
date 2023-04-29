package com.hsy.api.rest.demo.controllers;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PostController {
    private final ObjectMapper objectMapper;

    public PostController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping("/posts")
    public List list() {
        List<PostDTO> postsDtos = List.of(
                new PostDTO("1", "test1", "content"),
                new PostDTO("2", "test2", "content")
        );

        return postsDtos;

    }

    @GetMapping("/posts/{id}")
    public String detail(@PathVariable String id) throws JsonProcessingException {
        PostDTO postDTO = new PostDTO(id, "제목", "테스트");

        String json = objectMapper.writeValueAsString(postDTO);
        if (id.equals("404")) {
            throw new PostNotFound();
        }
//        return "게시물 상세\n" + id;
        return json;
    }

    @PostMapping("/posts")
    public String create(
            @RequestBody(required = false) String body
    ) throws JsonProcessingException {
        PostDTO postDTO = objectMapper.readValue(body, PostDTO.class);
        return postDTO.getTitle();
        // return "{\"action\" : \"게시물 생성\", \"body\" : \"\"}";
    }

    @PatchMapping("/posts/{id}")
    public PostDTO update(
            @PathVariable String id,
            @RequestBody(required = false) PostDTO postDTO
    ) {
        postDTO.setId(id);
        return postDTO;
    }

    @DeleteMapping("/posts/{id}")
    public String delete(
            @PathVariable String id
    ) {
        return "게시물 삭제:" + id;
    }


    @ExceptionHandler(PostNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String postNotFound() {
        return "게시물을 찾을 수 없습니다.\n";
    }


}
