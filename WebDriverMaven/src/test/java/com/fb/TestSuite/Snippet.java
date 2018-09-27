package com.fb.TestSuite;

public class Snippet {
	private String name="Gaurav";
	public String name2="abc";
	int a=2;
	
	public Snippet(){
		System.out.println(name);
	}
	
	public Snippet(String xyz){
		System.out.println(name2);
		
	}
	
	public Snippet(int xyz){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Snippet object=new Snippet();
	}
	
}

