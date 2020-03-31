package oop7.sub;

import oop7.Modifier;

public class ModifierChild extends Modifier{

	public void test() {
		c = 10;				// protected   --> 		상속 받은 경우에 접근할 수 있음
		d = 10;				// public
	}
}
