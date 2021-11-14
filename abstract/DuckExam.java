package javaStudy;

public class DuckExam {
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        // Bird b = new Bird(); 추상클래스 자체로 객체 생성 안됨.
    }
}
