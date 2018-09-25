package com.fb.TestSuite;

public class ConstructorTest {
	static ConstructorTest a;
	
	/* public ConstructorTest() {
		a=new ConstructorTest();
		a.print();

 }*/
	 
	public static void main(String[] abc) {
		a=new ConstructorTest();
		a.print();
	}
	
	public void print() {
		System.out.println("Null Pointer");
	}
	
}
