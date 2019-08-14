package com.learn.java.singleton;

public class Singleton {

	private static Singleton singleton_instance;
	private String s;

	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {

		// instantiating Singleton class with variable x
		Singleton x = Singleton.getInstance();

		// instantiating Singleton class with variable y
		Singleton y = Singleton.getInstance();

		// instantiating Singleton class with variable z
		Singleton z = Singleton.getInstance();

		// changing variable of instance x
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}

}
