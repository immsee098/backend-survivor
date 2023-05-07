package com.hsy.api.rest.demo.models;

import com.github.f4b6a3.tsid.*;

import java.util.*;

public class PostId {
    private String id;

    public PostId(String id) {
        this.id = id;
    }

    public static String of(String id) {
        return new PostId(id);
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostId postId = (PostId) o;
        return Objects.equals(id, postId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static PostId generate() {
        return new PostId(TsidCreator.getTsid().toString());
    }
}
