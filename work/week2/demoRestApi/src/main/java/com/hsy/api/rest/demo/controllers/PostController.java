package com.hsy.api.rest.demo.controllers;

import com.fasterxml.jackson.core.*;
import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.exceptions.*;
import com.hsy.api.rest.demo.services.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
//@CrossOrigin("https://seed2whale.github.io")
public class PostController {
    private final GetPostDTOListService getPostDTOListService;
    private final PostService postService;

    public PostController(GetPostDTOListService getPostDTOListService, PostService postService) {
        this.getPostDTOListService = getPostDTOListService;
        this.postService = postService;
    }

//    @SupportedOptions()
//    public options() {
//
//    }

    @GetMapping("/posts")
    public List list(
            //HttpServletResponse response
    ) {
        List postsDtos = postService.getPosts();
        //response.addHeader("Access-Control-Allow-Origin", "https://seed2whale.github.io");
        return postsDtos;

    }

    @GetMapping("/posts/{id}")
    public PostDTO detail(@PathVariable String id) throws JsonProcessingException {
        PostDTO postDTO = postService.getPostDto(id);
//        PostDTO postDTO = new PostDTO(id, "제목", "테스트");
//
//        String json = objectMapper.writeValueAsString(postDTO);
//        if (id.equals("404")) {
//            throw new PostNotFound();
//        }
//        return "게시물 상세\n" + id;
        return postDTO;
    }

    @PostMapping("/posts")
    public PostDTO create(
            @RequestBody(required = false) PostDTO postDTO
    ) throws JsonProcessingException {
        PostDTO created = postService.createPost(postDTO);
//        String id = UUID.randomUUID().toString().replace("-", "");
//        String id = UlidCreator.getUlid().toString();
//        String id = TsidCreator.getTsid().toString();
//        postsDtos.add(new PostDTO(id, "제목", "생성3"));
//        PostDTO postDTO = objectMapper.readValue(body, PostDTO.class);
//        return postDTO.getTitle();
        // return "{\"action\" : \"게시물 생성\", \"body\" : \"\"}";
        return created;
    }

    @PatchMapping("/posts/{id}")
    public PostDTO update(
            @PathVariable String id,
            @RequestBody(required = false) PostDTO postDTO
    ) {
        PostDTO updated = postService.updatePost(id, postDTO);
        postDTO.setId(id);
        return updated;
    }

    @DeleteMapping("/posts/{id}")
    public PostDTO delete(
            @PathVariable String id
    ) {
        PostDTO postDTO = postService.deletePost(id);
        return postDTO;
    }


    @ExceptionHandler(PostNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String postNotFound() {
        return "게시물을 찾을 수 없습니다.\n";
    }


}
