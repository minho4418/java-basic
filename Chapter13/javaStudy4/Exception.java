package javaStudy4;

public class Exception {
    public static void main(String[] args){
        int i = 10;
        int j = 0;
        try { // 수행할 코드, 예외 발생 가능성이 있는 블록
            int k = i / j;
            System.out.println(k);
        }catch (ArithmeticException e){ // 예외 처리 블록
            System.out.println("0으로 나눌 수 없음."+e.toString()); // e.toString() 예외의 정보를 알려주는 메소드
        }finally { // 예외 발생 여부 상관없이 반드시 실행
            System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행");
        }
        System.out.println("main end!!");
    }
}
