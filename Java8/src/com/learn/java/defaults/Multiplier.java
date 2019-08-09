package com.learn.java.defaults;

import java.util.List;

public interface Multiplier {

	int multiply(List<Integer> integers);

	default int size(List<Integer> integers) {
		return integers.size();
	}

	static boolean listEmpty(List<Integer> integers) {
		return integers.isEmpty();
	}
}
