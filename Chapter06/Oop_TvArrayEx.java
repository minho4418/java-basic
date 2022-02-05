package chapter6;

class Tv2{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

public class Oop_TvArrayEx {
    public static void main(String[] args){
        Tv2[] tvArr = new Tv2[3];

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv2();   // 객체 배열 생성 후 초기화를 해줘야됨.
            tvArr[i].channel = i+10;
        }

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
    }
}