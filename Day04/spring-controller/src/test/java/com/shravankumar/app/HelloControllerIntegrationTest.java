package com.shravankumar.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest({HelloController.class})
public class HelloControllerIntegrationTest{
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testHelloControllerHello() throws Exception {
        ResultActions responseEntity  = mockMvc.perform(get("/hello"));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Hello from App", result);
    }
    @Test
    public void testHelloControllerRequestHello() throws Exception {
        ResultActions responseEntity  = mockMvc.perform(get("/request/hello"));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Hello from Request mapping", result);
    }
    @Test
    public void testHelloControllerWelcome() throws Exception {
        String name="name";
        ResultActions responseEntity  = mockMvc.perform(get("/welcome").param( "name","name"));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("welcome to "+name, result);
    }
    @Test
    public void testHelloControllerSendMessage() throws Exception {
        String message="hi";
        ResultActions responseEntity  = mockMvc.perform(get("/send/"+message));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("send message "+message, result);
    }
}