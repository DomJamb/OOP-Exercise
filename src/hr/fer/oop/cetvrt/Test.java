package hr.fer.oop.cetvrt;

interface A {
	int m();
}

class B implements A {
	public int m() {
		return 1;
	}
}

class C extends B {
	public int m() {
		return 2;
	}
}

public class Test {

	public static void main(String[] args) {
		A ref1 = new C();
		B ref2 = (B) ref1;
		System.out.println(ref2.m());
	}

}
