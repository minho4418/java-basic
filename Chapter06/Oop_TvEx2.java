package chapter6;

class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

public class Oop_TvEx2 {
    public static void main(String[] args){
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t2 = t1;  // t2의 값을 잃어버리고 t1이 저장하고 있는 값(주소)를 t2에 저장
        t1.channel = 7;

        System.out.println("현재 채널은 " + t1.channel + "입니다.");
        System.out.println("현재 채널은 " + t2.channel + "입니다.");
    }
}