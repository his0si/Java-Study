package org.test.calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("실수를 입력하세요, 정수도 가능: ");

	    // 입력받은 숫자를 변수에 저장
	    double input = scan.nextDouble();
	    
	    System.out.println("입력된 실수: " + input);


	}

}
