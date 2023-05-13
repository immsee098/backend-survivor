package com.hsy.api.rest.demo.controllers;

import com.hsy.api.rest.demo.dtos.*;
import com.hsy.api.rest.demo.services.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PostController.class)
public class MockPostControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    PostService postService;

    @MockBean
    private GetPostsService getPostsService;

    @MockBean
    private GetPostService getPostService;

    @MockBean
    private CreatePostService createPostService;

    @MockBean
    private UpdatePostService updatePostService;

    @MockBean
    private DeletePostService deletePostService;

    @Test
    public void list() throws Exception {
        given(getPostsService.getPostDtos()).willReturn(List.of(
                new PostDTO("1", "제목", "내용")
        ));

        this.mockMvc.perform(MockMvcRequestBuilders.get("/posts"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("제목")
                ));
    }

    @Test
    public void create() throws Exception {
        String json = """
                {
                	"title": "새 글",
                	"content": "제곧내"
                }
                """;

        this.mockMvc.perform(
                        post("/posts")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        verify(createPostService)
                .createPost(new PostDTO(null, "새 글", "제곧내"));
    }
}
