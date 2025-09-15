package Test;

public class B extends A{
	public B() {};
	
	public void f() {
		System.out.println("in B's f");
		return;
	}
	
	public void h(int i) {
		System.out.println("in B's h, i= " + i);
		return;
	}
	
	public void s (int j) {
		System.out.println("in B's s, j= " + j);
		return;
	}
}
