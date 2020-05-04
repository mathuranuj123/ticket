package com.springboot.example.ticketstarter.domain;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String arg[]) {

		String rStr = "";
		String str = "testing";
		System.out.println(str.length() % 2);
		System.out.println(str.length() / 2);
		if (str.length() % 2 == 0) {
			int charNo = str.length() / 2;
			rStr = str.substring(charNo - 1, charNo+1);
		} else {
			int charNo = str.length() / 2;
			rStr = str.substring(charNo, charNo +1);
		}
		System.out.println(rStr);
	}
}
