package com.hsy.api.rest.demo.controllers;

import com.hsy.api.rest.demo.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @GetMapping("/posts")
    public String list() {
        return "게시물 목록\n";
    }

    @GetMapping("/posts/{id}")
    public String detail(
            @PathVariable String id
    ) {
        if (id.equals("404")) {
            throw new PostNotFound();
        }
        return "게시물 상세\n" + id;
    }

    @PostMapping("/posts")
    public String create(
            @RequestBody(required = false) String body
    ) {
        return "{\"action\" : \"게시물 생성\", \"body\" : \"\"}";
    }

    @PatchMapping("/posts/{id}")
    public String update(
            @PathVariable String id,
            @RequestBody(required = false) String body
    ) {
        return "{\"action\" : \"게시물 수정\" " + id + ", \"body\" : " + body.replace("\"", "\\\"") + " \"\"}";
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
