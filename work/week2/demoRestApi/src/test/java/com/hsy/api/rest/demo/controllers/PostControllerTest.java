package com.hsy.api.rest.demo.controllers;

import com.hsy.api.rest.demo.repository.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PostControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    PostController postController;

    @SpyBean
    @Autowired
    PostRepository postRepository;

    @Test
    void create() throws Exception {
        String json = """
                {
                    "title":"새 글",
                    "content":"제곧내"
                }
                """;

        int oldSize = postRepository.findAll().size();
        mockMvc.perform(MockMvcRequestBuilders.post("/posts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                )
                .andExpect(status().isCreated());

        verify(postRepository).save(any());

        int newSize = postRepository.findAll().size();
        assertThat(newSize).isEqualTo(oldSize + 1);
    }

}