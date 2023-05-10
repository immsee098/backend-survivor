package com.hsy.api.rest.demo;

import com.hsy.api.rest.demo.repository.*;

public class Factory {
    private static PostRepository postRepository;

    public static PostRepository postRepository() {
        if (postRepository == null) {
            postRepository = new PostRepository();
        }
        return postRepository;
    }
}
