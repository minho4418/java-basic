package javaStudy;

public class Car {
    String name;
    int number;
    // 생성자 : 객체가 될때 필드를 초기화해줌.

    public Car(String name){ // n어떤 약자 인지 정확하지 않아 수정
        this.name = name; // this : 객체 자신을 참조함
    }
}