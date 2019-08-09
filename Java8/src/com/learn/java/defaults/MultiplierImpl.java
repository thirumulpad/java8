package com.learn.java.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> integers) {
		// TODO Auto-generated method stub
		return integers.stream().reduce(1, (x, y) -> x * y);
	}

}
