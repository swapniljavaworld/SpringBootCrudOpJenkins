package com.google.cj;

class Ex{
	public void m1() {
		System.out.println("From EX-M1");
	}
	 void m2() {
		System.out.println("From EX-M2");
	}
}
public class InhDEmo extends Ex{
	
	public void m1() {
		System.out.println("From child-M1");
	}
	public void m2(int x) {
		System.out.println("From child-M2");
	}

	public static void main(String[] args) {
		Ex a=new InhDEmo();
		//a.m1();
		//
	//	a.m2(778);
	}

}
