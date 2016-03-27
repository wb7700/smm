package com.x7700.smm.learn.jdk8.service;

@FunctionalInterface
public interface IConverter<T, F> {
	T convert(F form);
}
