package com.hsy.api.rest.demo.repository;

import com.hsy.api.rest.demo.exceptions.*;
import com.hsy.api.rest.demo.models.*;

import java.util.*;

public class PostRepository {
    Map<PostId, Post> posts;

    public PostRepository() {
        this.posts = new HashMap<>();
        this.posts.put(PostId.of("1"), new Post(PostId.of("1"), "test1", MultilineText.of("content")));
        this.posts.put(PostId.of("2"), new Post(PostId.of("2"), "test2", MultilineText.of("content2")));
    }

    public List<Post> findAll() {
        return new ArrayList<>(posts.values());
    }

    public Post find(String id) {
        Post post = posts.get(id);
        if (post == null) {
            throw new PostNotFound();
        }
        return post;

    }

    public void save(Post post) {
        posts.put(post.id(), post);
    }

    public void delete(String id) {
        posts.remove(id);
    }
}
