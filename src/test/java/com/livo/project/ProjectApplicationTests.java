package com.livo.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {
	@MockBean
	ClientRegistrationRepository clientRegistrationRepository;
	
	@Test
	void contextLoads() {
	}

}
