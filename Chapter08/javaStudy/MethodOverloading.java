package javaStudy;

public class MethodOverloading {
    public static void main(String[] args){
        Myclass m = new Myclass();

        System.out.println(m.plus(4,5));

        System.out.println(m.plus(4,6,7));

        System.out.println(m.plus("hello", "world"));
    }
}
