package org.helloworld.Boolean;

public class Boolean {

	public static void main(String[] args) {
		
		//비교와 boolean
		System.out.println(1==2);//f
		System.out.println(1==1);//t
		
		System.out.println(1!=2);//t
		System.out.println(1!=1);//f
		System.out.println("one"=="two");//f
		System.out.println("one"=="one");//t
		
		String a = "Hello World!";
		String b = new String ("Hello World!");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
	}

}
