package com.codingdojo.ct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootTest
@Controller

class CounterApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@RequestMapping("/")
	public String index() {
		return "Welcome User";
	}

}
