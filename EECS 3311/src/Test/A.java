package Test;

public class A {
	public A() {};
	public void f() {
		System.out.println("in A's f");
		return;
	}
	public void h (int i) {
		System.out.println("in A's h, i= " + i);
		return;
	}
	public void s (double d) {
		System.out.println("in A's s, d= " + d);
		return;
	}
}
