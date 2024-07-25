package com.ict.day02;

public class Ex12 {
	public static void main(String[] args) {
		// 논리연산자 : &&(AND, 논리곱, 교집합)
		//            ||(OR, 논리합, 합집합)
		//            ! (NOT, 논리부정)
		
		// 연산 대상 : 비교연산자, 논리연산자 , 논리형(true, false)
		// 결과는 boolean 형이다.
		// 주로 조건식에 사용 된다.
		
		// &&(AND, 논리곱, 교집합)
		// 주어진 조건들이 모두 true 일때만 결과가 true
		// 만약에 하나라도 false 가 있으면  결과는 false
		// false 를 만나면 연산이 중단된다.(뒤에 연산을 하지 않는다.)
		
		// AND를 이용하면 범위를 지정할 수 있다.
		// a >= 10 && a <= 20  =>  a 는 10이상 20이하 이다.
		
		
		int su1 = 10 ;
		int su2 = 7 ;
		boolean res ;
		
	//  true =  true     &&  true		
		res  = (su1 >= 7) && (su2 >= 5);
		System.out.println(res);
		
	//  false =  true     &&  false		
		res  = (su1 >= 7) && (su2 <= 5);
		System.out.println(res);
		
	//  false =  false    &&  true	
		res  = (su1 <= 7) && (su2 >= 5);
		System.out.println(res);
		
	//  false =  false    &&  false	
		res  = (su1 <= 7) && (su2 <= 5);
		System.out.println(res);		
		
	}
}











