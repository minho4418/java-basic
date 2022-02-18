package chapter7;

public class SuperTest1 {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x = 10;
}

class Child extends Parent{
    int x= 20;

    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        // 자손클래스에서 선언된 멤버변수 x
        System.out.println("super.x = " + super.x);
        // 조상클래스로부터 상속받은 멤버변수 x
    }
}
