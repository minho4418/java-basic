package javaStudy3;

public class InnerExam3 { // 지역 중첩 클래스, 지역 클래스
    public void exec(){
        class Cal{ // 메소드 안에서 사용가능
            int value = 0;
            public void plus(){
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
    public static void main(String[] args){
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
