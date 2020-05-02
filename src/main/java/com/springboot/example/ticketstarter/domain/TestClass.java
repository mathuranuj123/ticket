package com.springboot.example.ticketstarter.domain;

public class TestClass {

	public static void main(String arg[]) {
		Runnable i = () -> {
			int a = 0;
			for(int l = a;l<=10;l++) {
				System.out.println(l);
			}
		};
		
		i.run();
	}
}
