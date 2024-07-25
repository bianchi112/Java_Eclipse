package com.ict.day03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 키보드를 받아서 아래 문제들을 처리하자 
		Scanner scan = new Scanner(System.in);
		
		// 점수를 받아서 90이상이면  "A학점", 80이상이면  "B학점", 나머지 "F학점"
		System.out.print("점수입력 : ");
		int su = scan.nextInt();
		String res = (su >= 90) ? "A학점" : ((su>=80)? "B학점" : "F학점");
		System.out.println("결과 : " + res);
		
		// 주민번호 뒤에 첫번째자리를 받아서 1, 3 이면 남자,  2, 4 이면 여자, 나머지는 외국인
		System.out.print("주민번호 뒤에 첫번째자리 수 입력 : ");
		su = scan.nextInt();
		res = (su == 1 || su == 3 ) ? "남자" : ( (su == 2  || su == 4)? "여자"  : "외국인");
		System.out.println("결과 : " + res);
				
		// 두수를 받아서  큰 수를 출력하자.
		System.out.print("첫번째 수 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = scan.nextInt();
		
		int result = (num1 > num2) ? num1  : num2  ;
		System.out.println("결과 : " + result);
		
	}

}





