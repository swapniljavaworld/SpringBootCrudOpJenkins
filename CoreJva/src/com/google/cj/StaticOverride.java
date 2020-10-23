package com.google.cj;

public class StaticOverride {

	public static void main(String[] args) {
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		
		//s=20
		MyClass.s=30;
		//s=30
		obj1.i=40;
		
		obj1.s=50;
		//s=50
		obj2.i=60;
		
		obj2.s=70;
		
		//s=70
		
		
		System.out.println("MyClass s=30---"+MyClass.s);
		System.out.println("Obj1    i=40---"+obj1.i);
		System.out.println("Obj1    s=50---"+obj1.s);
		System.out.println("Obj2    i=60---"+obj2.i);
		System.out.println("Obj2    i=70---"+obj2.s);
		

	}

}

class MyClass{
	int i=10;
	static int s=20;
	
	
}

