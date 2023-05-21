package com.example.demo.daos;

import com.example.demo.models.*;
import org.springframework.jdbc.core.*;

import java.util.*;

public class PostDaoImpl implements PostDao {
    private final JdbcTemplate jdbcTemplate;

    public PostDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Post> findAll() {
        List<Post> posts = new ArrayList<>();
        String sql = """
				SELECT * FROM posts;
				""";
        jdbcTemplate.query(sql, resultSet -> {
            String id = resultSet.getString("id");
            String title = resultSet.getString("title");
            Post post = new Post(id, title);
            posts.add(post);
        });

        return posts;
    }
}
