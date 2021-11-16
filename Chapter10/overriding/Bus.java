package com.java;

public class Bus extends Car { // extends 상속 : 같은 패키지네 클래스를 상속할 수 있다.

    public void run(){
        // 오버라이딩 : 부모클래스의 메소드를 자식 클래스에서 재정의하여 사용하는 것
        super.run(); // super : 자식 클래스에서 부모클래스의 메소드 호출
        System.out.println("Bus의 run 메소드");
    }
}
