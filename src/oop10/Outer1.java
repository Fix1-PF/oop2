package oop10;

public class Outer1 {

	int x;
	static int y;
	
	void m1() {
		Inner1 i = new Inner1();			// 외부 클래스의 멤버 메소드에서 내부 클래스 사용가능
	}
	static void m2() {
//		Inner1 i = new Inner1();			// 외부 클래스의 클래스 메소드에서 내부클래스 사용불가능
	}
	
	// 인스턴스 내부 클래스
	class Inner1 {
		int a;
//		static int b;				// 클래스 변수 선언할 수 없음
		
		void m3() {}
//		static void m4() {}			// 클래스 메소드 선언할 수 없음
		void m5() {
			System.out.println(x);
			System.out.println(y);
			m1();
			Outer1.m2();
			
			System.out.println(a);
			m3();
		}
	}
}
