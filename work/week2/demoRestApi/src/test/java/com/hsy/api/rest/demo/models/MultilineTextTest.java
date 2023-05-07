package com.hsy.api.rest.demo.models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MultilineTextTest {
    @Test
    void creation() {
        MultilineText multilineText = new MultilineText("1\n2\n3");

        assertEquals(2, multilineText.toString());
    }

}