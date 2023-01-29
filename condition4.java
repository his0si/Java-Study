package org.helloworld;

public class condition4 {

	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		switch(1) {
		
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
				
		}
	
		//같은 구문 if-else로 짜보기
		int val = 1;
		
		if(val==1) {
			System.out.println("one");
		}else if(val==2) {
			System.out.println("two");
		}else if(val==3) {
			System.out.println("three");
		}else {
				System.out.println("default");

		}
	}
}
