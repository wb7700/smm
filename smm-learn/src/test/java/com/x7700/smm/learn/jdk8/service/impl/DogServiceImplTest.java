package com.x7700.smm.learn.jdk8.service.impl;

import org.junit.Test;

import com.x7700.smm.learn.jdk8.service.IDogService;
import com.x7700.smm.learn.jdk8.service.impl.DogServiceImpl;

public class DogServiceImplTest {

	@Test
	public void test1() {
		IDogService dogService = new DogServiceImpl();
		dogService.eat();
		dogService.bark();
	}
}
