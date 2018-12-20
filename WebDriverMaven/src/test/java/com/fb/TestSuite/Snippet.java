package com.fb.TestSuite;

public class Snippet {
	private String name="Gaurav";
	public String name2="abc";
	int a=2;
	
	public void Snippet(){
		System.out.println(name);
	}
	
	public void Snippet(String xyz){
		System.out.println(name2);
		
	}
	
	public void Snippet(int xyz){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Snippet obj=new Snippet();
	}
	
}

