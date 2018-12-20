package com.fb.TestSuite;

public class TestOveriding extends Snippet{
	
	public void snippet() {
		System.out.println("#gaurav123");
		
	}
	
	public static void main(String[] args) {
			
			Snippet s = new TestOveriding();
			((TestOveriding) s).snippet();
	
	}
}
