package oop10;

public class Outer3 {

	int x;
	static int y;
	void m1() {}
	static void m2() {}
	
	void m3() {
		
		int a = 10;
		int b = 10;
		final int c = 10;

		class Inner3 {
			int 가;
//			static int 나;					// 클래스 변수를 정의할 수 없다.
			void m4() {}
//			static void m5() {}				// 클래스메소드를 정의할 수 없다.
			
			void m6() {
				System.out.println(x);
				System.out.println(y);
				m1();
				Outer3.m2();
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
	}
}
