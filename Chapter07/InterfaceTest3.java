package chapter7;

public class InterfaceTest3 {
    public static void main(String[] args){
        Child111 c = new Child111();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Parents{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}

class Child111 extends Parents implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

