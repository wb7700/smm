package com.x7700.learn.jdk8.service.impl;

import org.junit.Test;

import com.x7700.learn.jdk8.service.IDogService;

public class DogServiceImplTest {

	@Test
	public void test1() {
		IDogService dogService = new DogServiceImpl();
		dogService.eat();
		dogService.bark();
	}
}
