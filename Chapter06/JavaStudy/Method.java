package JavaStudy;

public class Method {
    // Method란
    // 매개변수(Parameter) : 전달된 인자를 받아들이는 변수
    // 인자(Argument) : 어떤 함수를 호출시에 전달되는 값
    // public 리턴타입 메소드명 (메개변수들){ 구현 }
    public void method1(){
        System.out.println("m1...");
    }
    public void method2(int x){
        System.out.println(x + "를 이용한 m2...");
    }
    public int method3(){    // 리턴타입 int -> 정수 리턴
        System.out.println("m3...");
        return 10;
    }
    public void method4(int x, int y){
        System.out.println(x + y + "를 이용한 m4...");
    }
    public int method5(int y){    // 리턴타입 int -> 정수 리턴 + int형 전달인자
        System.out.println(y + " : m5...");
        return y*2;
    }

}
