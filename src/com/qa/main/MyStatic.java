package com.qa.main;

public class MyStatic {

	static int x = 0;

	MyStatic() {
		x++;
	}

	void method() {
		System.out.print("-x" + x);
	}

	public void counter() {
		for (int i = 0; i < MyStatic.x; i++) {
			System.out.print(MyStatic.x);

		}
		 System.out.println("\n");
	}
}
