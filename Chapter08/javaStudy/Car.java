package javaStudy;

public class Car {
    String name;
    int number;
    // 생성자 : 객체가 될때 필드를 초기화해줌.

    public Car(String name){ // n어떤 약자 인지 정확하지 않아 수정
        this.name = name; // this : 객체 자신을 참조함
    }

    public Car(){
        // 생성자 오버로딩 : 메소드와 마찬가지로 매개변수의 수와 타입이 다르다면
        // 여러개의 생성자를 선언할 수 있다.
        //this.name = "이름없음";
        //this.number = 0;
        this("이름없음",0);
    }
    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }
}
