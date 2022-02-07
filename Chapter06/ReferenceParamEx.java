package chapter6;

class Data1{
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args){
        Data1 s = new Data1();
        s.x=10;
        System.out.println("main : x = " + s.x);

        change(s);
        System.out.println("After change(s.x)");
        System.out.println("main : x = " + s.x);
    }

    static void change(Data1 s){   // 참조형 매개변수로 s.x값을 변경할 수 있음.
        s.x = 1000;
        System.out.println("change : x = " + s.x);
    }
}
