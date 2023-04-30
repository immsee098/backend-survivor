package com.hsy.api.rest.demo.controllers;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
//@CrossOrigin("https://seed2whale.github.io")
public class PostController {
    private final ObjectMapper objectMapper;
    private List<PostDTO> postsDtos = new ArrayList<>(List.of(
            new PostDTO("1", "test1", "content"),
            new PostDTO("2", "test2", "content")
    ));


    public PostController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

//    @SupportedOptions()
//    public options() {
//
//    }

    @GetMapping("/posts")
    public List list(
            //HttpServletResponse response
    ) {
        //response.addHeader("Access-Control-Allow-Origin", "https://seed2whale.github.io");
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
    public PostDTO create(
            @RequestBody(required = false) PostDTO postDTO
    ) throws JsonProcessingException {
        postsDtos.add(new PostDTO("3", "제목", "생성3"));
//        PostDTO postDTO = objectMapper.readValue(body, PostDTO.class);
//        return postDTO.getTitle();
        // return "{\"action\" : \"게시물 생성\", \"body\" : \"\"}";
        return postDTO;
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
    public PostDTO delete(
            @PathVariable String id
    ) {
        PostDTO postDTO = postsDtos.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .get();

        postsDtos.remove(postDTO);

        return postDTO;
    }


    @ExceptionHandler(PostNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String postNotFound() {
        return "게시물을 찾을 수 없습니다.\n";
    }


}
