package com.example.demo;

import org.springframework.boot.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.support.*;

@Component
public class AppRunner implements CommandLineRunner {
    private final JdbcTemplate jdbcTemplate;
    private final TransactionTemplate transactionTemplate;

    public AppRunner(JdbcTemplate jdbcTemplate, TransactionTemplate transactionTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void run(String... args) {
//        String sql = "SELECT name FROM people WHERE name LIKE ?";
//
//        System.out.println("-".repeat(80));
//
//        jdbcTemplate.query(sql, resultSet -> {
//            String name = resultSet.getString("name");
//
//            System.out.println(name);
//        }, "%우");

//        String sql = """
//		INSERT INTO people (name, age, gender) VALUES (?, ?, ?)
//		""";
//
//        jdbcTemplate.update(sql, "홍길동", 15, "남");
        transactionTemplate.execute(status -> {
            String sql = """
				INSERT INTO people(name, age, gender) VALUES(?, ?, ?)
				""";

            jdbcTemplate.update(sql, "홍길동", 15, "남");

            // 이런 식으로 예외를 던지면 전부 없던 일로 만들 수 있다.
            // throw new RuntimeException("FAIL!");

            return null;
        });
    }

}
