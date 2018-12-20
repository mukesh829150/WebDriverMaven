package com.fb.TestSuite;

import org.testng.annotations.Test;

public class ImplementAbstract extends TestAbstract{
	
		static int c;
		static int d =5;
		
		public static void b() {
			//int d =5;
			System.out.println(d);
		}
		
		public ImplementAbstract() {
		}
	
		@Test
		public void run() {
		ImplementAbstract a = new ImplementAbstract();
		c = 3;
		a.test();
		b();
		}

		public int test() {
			System.out.println(c);
			return c;
		}
}
