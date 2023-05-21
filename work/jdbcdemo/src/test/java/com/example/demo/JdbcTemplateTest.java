package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;

public class JdbcTemplateTest {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void test() {
    }
}
