package com.java;

public class BusExam {
    public static void main(String[] args){
        Car c = new Bus(); // bus를 참조
        c.run();
        // c.ppangppang(); 오류
        // 부모 타입으로 자식을 가리킬 수 있다.
        // 이 경우 부모가 가지고 있는 내용만 사용 가능!

        // Bus bus = c ; c가 더 상위이므로 형변환 안됨. 작은 것에서 큰거 안됨.
        Bus bus = (Bus) c; // 형변환 -> 참조하고 있는게 bus였기때문에
        bus.run();
        bus.ppangppang();
    }
}