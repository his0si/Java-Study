package org.helloworld;

import java.util.Scanner;

public class condition2 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
        
        System.out.println("문자열입력: ");
        String str = Scan.nextLine();
		
		if(str.equals("egoing")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
		Scan.close();
	}

}
