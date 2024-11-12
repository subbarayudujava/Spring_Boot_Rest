package com.nit.main;

public class App {
	public int sum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		App app = new App();
		int sum1 = app.sum(100, 200);
		 System.out.println("sum of value:"+sum1);
		//System.out.println("sum result value:" + app.sum(100, 200));
	}
}
