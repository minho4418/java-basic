package chapter7;

class Parent1{
    int x = 100;

    void method(){
        System.out.println("parent");
    }
}

class Child1 extends Parent1{
    int x = 200;

    void method(){
        System.out.println("child");
    }
}

public class BindingTest {

    public static void main(String[] args){
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println(p.x);
        System.out.println(c.x);
        p.method(); // 메서드인 경우 실제 인스턴스의 타입클래스에 정의된 메서드가 호출
        c.method();
    }

}
