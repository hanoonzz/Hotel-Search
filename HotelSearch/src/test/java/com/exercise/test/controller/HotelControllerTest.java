package com.exercise.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.exercise.WebConfig;
import com.exercise.controller.HotelController;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebConfig.class})
@WebAppConfiguration
public class HotelControllerTest extends TestCase {
	
	private MockMvc mockMvc;

    @InjectMocks
    private HotelController controller;
    
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                             .build();
        
    }

    
    @Test
    public void testGetSearchHotel() throws Exception {

        mockMvc.perform(get("/hotel.html"))
            .andExpect(status().isOk());
    }
}
