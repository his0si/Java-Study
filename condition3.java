package org.helloworld;

import java.util.Scanner;

public class condition3 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
        System.out.println("문자열입력: ");
        String str = Scan.nextLine();
        String password = Scan.nextLine();
		
		if(str.equals("egoing")) {
			if(password.equals("111111")) {
			System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}else {
			System.out.println("wrong");
		}
		Scan.close();
	}

}