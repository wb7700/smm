package com.x7700.smm.learn.jdk8.util;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.x7700.smm.learn.jdk8.util.LambdaUtil;

public class LambdaUtilTest {

	@Test
	public void testSortLambda() {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		System.out.println(names);
		LambdaUtil.sortStringLambda(names);
		System.out.println(names);
	}
}
