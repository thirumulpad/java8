package com.learn.java.optional;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> ofNullable() {
		return Optional.ofNullable(null);
	}

	public static Optional<String> of() {
		return Optional.of("Hello");
	}

	public static Optional<String> empty() {
		return Optional.empty();
	}

	public static void main(String[] args) {
		System.out.println(ofNullable());
		System.out.println(of());
		System.out.println(empty());
	}

}
