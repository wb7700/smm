package com.x7700.learn.jdk8.service;

@FunctionalInterface
public interface IConverter<T, F> {
	T convert(F form);
}
