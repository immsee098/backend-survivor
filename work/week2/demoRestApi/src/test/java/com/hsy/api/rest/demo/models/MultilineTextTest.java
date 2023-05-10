package com.hsy.api.rest.demo.models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MultilineTextTest {
    private MultilineText multilineText;

//    @BeforeEach
//    void createMultilineText() {
//
//    }

    @Test
    void creation() {
        MultilineText multilineText = new MultilineText("1\n2\n3");

        assertEquals(2, multilineText.toString());
    }

//    @Test
//    void step2(){
//        assertEquals("1\n2\n3");
//    }

}