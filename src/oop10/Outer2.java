package oop10;

public class Outer2 {

	int x;
	static int y;
	void m1() {
		Inner2 i = new Inner2();
	}
	static void m2() {
		Inner2 i = new Inner2();
	}
	
	static class Inner2 {
		int a;
		static int b;					// 클래스변수의 선언이 가능
		void m3() {}
		static void m4() {}				// 클래스메소드의 선언이 가능하다.
		
		void m5() {
//			System.out.println(x);
			System.out.println(Outer2.y);
//			m1();
			Outer2.m2();
		}
		
	}
}
