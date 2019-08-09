package com.learn.java.defaults;

public class ClientABC implements Interface1, Interface2, Interface3 {
	public static void main(String[] args) {
		ClientABC abc = new ClientABC();
		abc.methodA();
		abc.methodB();
		abc.methodC();
	}


}
