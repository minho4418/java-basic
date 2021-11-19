package javaStudy3;

public class InnerExam1 {
    class Cal{ // 내부클래스, 중첩클래스, 인스턴스 클래스
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args){
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
