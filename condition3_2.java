package org.helloworld;

import java.util.Scanner;

public class condition3_2 {

	//논리 연산자를 사용해 if문을 중첩하지 않고 간결하게 씀
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
        System.out.println("문자열입력: ");
        String str = Scan.nextLine();
        String password = Scan.nextLine();
		
		if(str.equals("egoing")&&password.equals("111111")) {
			System.out.println("right");
			
		}else {
			System.out.println("wrong");
		}
		Scan.close();
	}

}