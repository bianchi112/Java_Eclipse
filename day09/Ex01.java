package com.ict.day09;

public class Ex01 {
  /*
    클래스 
     1. 정의 : 객체(오브젝트, Object)를 만들어서 사용할 모든 정보를 가지고 있는 파일
              보통 설계도, 거푸집으로 표현한다.
              데이터를 저장하는 측면에서는 모든 각종 기본자료형과 참조자료형을 저장할 수 있다.
              변수 < 배열 < 클래스 < 객체형 배열 (참조자료형 배열)
              변수 < 배열 < 클래스 < 컬렉션 
                                
     2. 클래스가 가질 수 있는 3가지 요소 
        - 멤버 필드   : 변수와 상수, 속성, 특성
        - 멤버 메서드 :  동작, 기능, 하는 것
        - 생성자 : 클래스를 객체로 만들 때 한번 호출 된다.
                 멤버 필드 의 초기값을 지정하는 것이 목적
                  
     3. 클래스 구조 : 헤더, 멤버필드, 멤버메서드, 생성자 
        1) 헤더 : [접근제한자] [클래스종류] class 클래스이름        
         가) 접근제한자 : 클래스, 멤버필드, 멤버메서드, 생성자에 모두 사용 가능(생략가능)
                       외부에서 접근해서 사용할 수 있는 권한 
            - public  : 누구나 다 접근 가능하다.
            - private : 외부에서는 절대 접근 불가능, 내부(클래스안에 있는 멤버끼리는 접근 가능)     
                        객체 지향 언어의 특징 중 정보 은닉 개념에 해당 된다.  
            - 생략(default) : 같은 패키지에서만 접근 가능  
            - protected : 같은 패키지에서만 접근 가능 , 
                          다른 패키지에서는 상속관계(부모/자식)에 있을 때 접근 가능
         나) 클래스종류 : 특정기능을 가진 클래스에게만 사용되는 예약어 작성
                       final, abstract  
                       일반클래스에서는 생략한다.
         다) class : 클래스임을 나타내는 예약어
         라) 클래스이름 : 클래스이름 = 저장파일이름 = 생성자이름   
                       첫글자 대문자 나머지 소문자로 만든다.
                       두 단어 이상일때 단어들의 첫글자는 대문자로 만든다.
                        
       패키지 : 클래스들을 용도나 목적에 따라 그룹으로 만드는 것
               자바파일에 맨 위에 위치 한다.
       import : 자바에서는 패키지가 java.lang 이외에 있는 클래스를
                현재 클래스에서 사용하기 위해서 사용할 클래스의 위치 선언하는 것
                (현재 클래스에서 java.lang 이외에 있는 해당 클래스를 
                사용하기 위해서 참조할 수 있도록 하는 것)         
                
       2) 멤버필드 : 데이터, 속성, 상태값, 특성, 
         가) 변수 : 언제든지 변할 수 있는 속성, 상태값, 메모리 상태
         나) 상수 : 한번 저장되면 절대로 변경할 수 없는 속성, 상태값, 메모리 상태
         
       3) 멤버 메서드 : 동작, 기능, 하는 것
         - 자바에서는 메서드를 클래스 안에서만 만들 수 있다.
         - 해당 메서드를 호출하면 해당 메서드가 고유기능을 실행한다.
         - 고유기능이 실행 된 후 호출한 곳으로 되돌아 간다.
           예) main()메서드 JVM이 호출 했으니까 
              main()가 끝나면 JVM으로 되돌아 간다.(프로그램 종료)
         - 메서드가 다른 메서드 호출할 수 있다.  
         가) 구성
         [접근제한자][메서드종류] 반환형 메서드이름([인자 또는 매개변수]){실행내용} 
         - 접근제한자 : 클래스의 접근제한자 와 같다.
                     public, private, 생략(default), protected
         - 메서드종류 : 일반 메서드는 메서드 종류 생략한다
         - 반환형 : 메서드가 실행이 끝나면 자기를 호출한 곳으로 되돌아 가는데 
                  실행 결과를 가지고 갈수도 있고 실행결과를 가지고 가지 않을 수도 있다.
                  이때 실행결과를 가지고 갈 때 결과의 자료형을 반환형이라고 한다.
                  그러나 실행결과를 가지고 가지 않을 때는 반환형이 없으므로 void 라는 예약어를 사용 
           예) main() 메서드는 반환형이 void 이므로 자기를 호출한 JVM 아무것도 가져가지 않는다.
         - 메서드이름 : 변수 이름 만드는 방법과 같다.
                      즉, 첫글자 소문자로 시작하고
                      두 단어 이상일때 단어들의 첫글자는 대문자로 사용
         - 인자 또는 매개변수 : 메서드가 실행할 때 필요한 정보를 외부에서 받기 위한 통로 
             메서드이름이 같아도 인자 수나 인자의 자료형 다르면 다른 메서드로 취급 한다.
             오버로딩(중복정의) : 같은 클래스안에서 같은이름을 가진 메서드가 여러개 존재
                               (단, 인자의 수나 인자의 자료형이 달라야 한다.)   
                               
        4) 생성자 : 클래스를 객체로 만들 때 한번 호출된다.
          가) 목적 : 멤버필드(변수와 상수)의 초기값을 지정하는 것
          나) - 생성자이름 = 클래스이름 = 저장파일이름
              - [접근제한자] 생성자이름([인자]){내용}
              - 메서드와 다른점 반환형 자체가 없다.
              - 생성자도 오버로딩이 가능
              - 생성자도 오버로딩된 다른 생성자를 호출 할 수 있다.
              
              - 클래스는 무조건 생성자가 존재한다 => 틀림 
              - 생성자가 없으면 해당 클래스는 객체 생성 못한다. => 틀림
              
              - 생성자가 없으면 자바 컴파일러가 기본 생성자를 이용해서 객체 생성하게 한다.
              - 해당 클래스의 생성자가 있으면 클래스가 가지고 있는 생성자를 이용해서 객체 생성
              - 기본 생성자란 인자가 없는 (매개변수가없는) 생성자를 말한다.
                [public] 클래스이름(){ 내용 }  
           다) 생성자를 이용해서 객체 만드는 방법
              클래스이름   참조변수 = new              생성자이름([인자]);     
              Scanner    scan  = 객체 생성하는 예약어  Scanner(System.in) ;
              
               
       4. static 과 instance : 멤버필드, 멤버메서드에 공통으로 해당 되는 사항       
           1) instance(인스턴스) : 객체 생성
           - 인스턴스 필드(변수와 상수), 인스턴스 메서드  : 객체가 생성 될때 같이 생성되는 멤버필드와 멤버메서드를 말함
           - 일반적인 멤버필드와 멤버메서드가 인스턴스 필드와 인스턴스 메서드에 속한다.
           - 사용법
             1. 객체 생성을 먼자 하자 :  클래스이름   참조변수 = new   생성자이름([인자]);
             2. 참조변수.변수이름,  참조변수.메서드이름() 
           - 배열처럼 heap 메모리에 생성된다.  
           
           2)static  
           - static 필드, static 메서드 : 객체 생성과 상관없이 미리 만들어지는 멤버필드와 멤버메서드
           - static 반드시 static 예약어를 사용한다.
           - 사용법
             클래스이름.변수(System.out) ,  클래스이름.메서드(Math.random())
           - static 메모리에 생성 된다.   
                                   
         * 메서드 안에 있는 지역변수는 해당 메서드가 실행 될때 만들어진다.    
           해당 메서드가 끝나면 지역변수도 사라진다. 
           
      메모리
        - static : 프로그램이 시작 전부터 끝까지 존재하는 메모리 영역 
                   static 필드, static 메서드
        - heap : 프로그램이 시작할때 있거나 중간에 만들어졌다가 
                 어느 순간에 없어진다(동적할당)
                 자기 할일 다면 사라진다.
        - stack : heap 영역에 생성된 Object 타입의 데이터의 참조값을 할당된다.
                  원시타입의 데이터가 값과 함께 할당된다.
                  기본자료형은 실제 데이터 값이 저장된다.
                 
   */
}










