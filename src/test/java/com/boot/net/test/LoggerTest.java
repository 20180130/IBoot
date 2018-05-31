package com.boot.net.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(value = SpringRunner.class)
@SpringBootTest
public class LoggerTest {
	@Test
	public void contextLoads() {
	}

	private MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。

	@Autowired
	private WebApplicationContext wac; // 注入WebApplicationContext

	@Before // 在测试开始前初始化工作
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	
	/*@Test
	public void testSchoolController() throws Exception {
		String url = "/rept/event/perception/v1";
		String json = getPedestrianPerception();
		System.err.println(json);
		try {
			MvcResult result = mockMvc.perform(post(url).content(json).contentType(MediaType.APPLICATION_JSON_UTF8))  
	                .andExpect(status().isOk())// 模拟向testRest发送get请求    
	                .andReturn();// 返回执行请求的结果    
            System.out.println(result.getResponse().getContentAsString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}*/
	
	@Test
	public void testSchoolController() throws Exception {
		String url = "/school/";
		try {
			MvcResult result = mockMvc.perform(post(url))  
	                .andExpect(status().isOk())// 模拟向testRest发送get请求    
	                .andReturn();// 返回执行请求的结果    
            System.out.println(result.getResponse().getContentAsString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
