package oop7.sub;

import oop7.Modifier;

public class ModifierDemo2 {

	public static void main(String[] args) {
		Modifier m = new Modifier();
		
		// Modifier과 다른 패키지에 위치한 ModifierDemo2 에서는
		// public 접근제한이 지정된 멤버에만 접근할 수 있다.
		m.d = 10;
	}
}
