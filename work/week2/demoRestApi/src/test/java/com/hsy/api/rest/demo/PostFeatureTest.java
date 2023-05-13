package com.hsy.api.rest.demo;

import com.hsy.api.rest.demo.dtos.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.web.client.*;

import java.util.regex.*;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostFeatureTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Value("${local.server.port}")
    private int port;

    @Test
    @DisplayName("게시물 목록 관리")
    void list() {
        String url = "http://localhost:" + port + "/posts";

        PostDTO postDto = new PostDTO("ID", "새 글", "제곧내");
        String body = restTemplate.getForObject(url, String.class);

        //restTemplate.postForLocation(url, postDto);

        String id = findLastId(body);

        assertThat(body).doesNotContain(id);

        assertThat(body).contains("새 글");
        assertThat(body).contains("제곧내");
    }

    private String findLastId(String body) {
        Pattern pattern = Pattern.compile("\"id\":\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(body);

        String id = "";
        while (matcher.find()) {
            id = matcher.group(1);
        }
        return id;
    }
}
