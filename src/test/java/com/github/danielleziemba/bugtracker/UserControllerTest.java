package com.github.danielleziemba.bugtracker;

import com.github.danielleziemba.bugtracker.controller.UserController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class UserControllerTest {

    /*private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testHomePage() throws Exception {
        this.mockMvc.perform(get("/")).andExpect(status().isOk())
                .andExpect(content().string("This is Home Page"));
    }*/

}
