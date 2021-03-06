package com.mayikt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext cxt){
		return args -> {
			System.out.println("let's inspect the beans provide by spring boot");
			//ApplicationContext.getBeanDefinitionNames()
			// 该方法用于获取 Spring 容器中定义的所有 JavaBean 的名称。
			String[] beanNames=cxt.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
