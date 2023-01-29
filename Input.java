package org.helloworld;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);//여기서 scan은 scanner이름
		//String 문장이라는 뜻
		//str에다가 문장을 보관(변수)
		//scanner.nextLine() 한 줄을 입력 받는다
        
        System.out.println("문자열입력: ");
        String str = Scan.nextLine();
        System.out.println(str);
        
        System.out.println("정수입력: ");
        int i = Scan.nextInt();
        System.out.println(i);
        
        System.out.println("실수입력: ");
        double j = Scan.nextDouble();
        System.out.println(j);
        
        Scan.close();

	}

}
