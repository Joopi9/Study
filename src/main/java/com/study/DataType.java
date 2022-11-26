package com.study;

public class DataType {

	static int a = 1;
	static void test(String... str) {
		a = 2;
	}
	public static void main(String[] args) {
		System.out.println(a);
	}
}
