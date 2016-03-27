package com.x7700.learn.jdk8.service;

public interface IDogService {
	
	default void bark(){
		System.out.println("Wang Wang!");
	}
	
	void eat();
}
