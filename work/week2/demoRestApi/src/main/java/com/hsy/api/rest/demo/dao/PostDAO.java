package com.hsy.api.rest.demo.dao;

import com.hsy.api.rest.demo.dtos.*;

import java.util.*;

public interface PostDAO {

    public List findAll();

    public PostDTO find(String id);

    public void save(PostDTO postDTO);

    public void delete(String id);
}
