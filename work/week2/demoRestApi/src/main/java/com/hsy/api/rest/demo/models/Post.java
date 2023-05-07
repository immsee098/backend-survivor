package com.hsy.api.rest.demo.models;

public class Post {
    private PostId id;

    private String title;

    private MultilineText content;

    public Post(PostId id, String title, MultilineText content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Post(String title, MultilineText content) {
        this.id = PostId.generate();
        this.title = title;
        this.content = content;
    }

    public PostId id() {
        return id;
    }

    public String title() {
        return title;
    }

    public MultilineText content() {
        return content;
    }

    public void update(String title, MultilineText content) {
        //타이틀에 대한 유효성 검사 등 비즈니스 로직을 포함할 때 게터 절대 안씀

        this.title = title;
        this.content = content;
    }
}
