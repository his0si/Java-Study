package org.helloworld.variable;

public class Variable {

	public static void main(String[] args) {
		
		int a;
		double b;
		String first;
		char second;
		
		a=1;
		System.out.println(a+1);
		
		b=1.34;
		System.out.println(b+1);
		
		first = "Hello";
		System.out.println(first);
		
		second = 'a';
		System.out.println(second);
		
		//형변환
		int c=3;
		System.out.println((double)c);//명시적 형변환
		
		double d=1;
		double e=c+d;
		System.out.println(e);//암묵적 형변환
		
	}

}
