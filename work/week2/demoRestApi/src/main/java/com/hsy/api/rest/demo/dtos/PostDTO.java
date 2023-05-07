package com.hsy.api.rest.demo.dtos;

import com.hsy.api.rest.demo.models.*;

public class PostDTO {
    private String id;
    private String content;
    private String title;

    public PostDTO(String id, String content, String title) {
        this.id = id;
        this.content = content;
        this.title = title;
    }

    public PostDTO(Post post) {
        this(post.id().toString(), post.title(), post.content().toString());
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PostDTO() {

    }

    public String getId() {
        return id;
    }

    // @JsonProperty("get-content") 따로 바꿔줘야함
    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
}
