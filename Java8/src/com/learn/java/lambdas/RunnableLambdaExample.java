package com.learn.java.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// prior to java 8

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside RUnnable created.");
			}
		};
		new Thread(runnable).start();

		// Lambda Runnable
		Runnable task3 = () -> {
			System.out.println(Thread.currentThread().getName() + " is running");
		};

		new Thread(task3).start();
		new Thread(() -> System.out.println("lambda passed as method thread")).start();
	}

}
