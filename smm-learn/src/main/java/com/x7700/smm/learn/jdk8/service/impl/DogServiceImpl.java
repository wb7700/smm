package com.x7700.smm.learn.jdk8.service.impl;

import com.x7700.smm.learn.jdk8.service.IDogService;

public class DogServiceImpl implements IDogService {

	@Override
	public void eat() {
		System.out.println("eat dog food!");
	}
}
