package com.example.demoTests.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MyMvcController.class)
class MyMvcControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testHello() throws Exception{
        MvcResult result = mockMvc.perform(get("/hello")).andExpect(status().isOk()).andReturn();
        assertEquals(result.getModelAndView().getViewName(), "helloView");
        assertEquals(result.getModelAndView().getModel().get("msg"), "Hello there...");
    }

}