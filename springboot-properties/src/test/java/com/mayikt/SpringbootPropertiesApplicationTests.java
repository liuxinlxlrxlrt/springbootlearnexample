package com.mayikt;

import com.mayikt.properties.Person;
import com.mayikt.properties.User;
import com.mayikt.properties.UserSource;
import com.mayikt.properties.UserValue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootPropertiesApplicationTests {
	@Autowired
	private User user;

	@Autowired
	private Person person;

	@Autowired
	private UserSource userSource;

	@Autowired
	private UserValue userValue;

	@Test
	void contextLoads() {
		System.out.println(user);
        System.out.println(person);
		System.out.println(userSource);
		System.out.println(userValue);
	}
}
