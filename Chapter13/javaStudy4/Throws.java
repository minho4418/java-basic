package javaStudy4;

public class Throws {
    public static void main(String[] args){
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    public static int divide(int i , int j) throws ArithmeticException{
        int k = i/j;
        return k;
    } // throws : 메소드를 호출하는 쪽에서 처리하라고 넘기는 것
}
