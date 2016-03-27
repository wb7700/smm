package com.x7700.learn.jdk8.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaUtil {

	public static void sortStringEarly(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
	}

	public static void sortStringLambda(List<String> names) {

		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		Collections.sort(names, (String a, String b) -> b.compareTo(a));

		Collections.sort(names, (a, b) -> b.compareTo(a));
	}
}
