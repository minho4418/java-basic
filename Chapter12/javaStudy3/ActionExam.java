package javaStudy3;

public class ActionExam {
    public static void main(String[] args){
//        Action action = new MyAction();
//        action.exec();
        Action action = new Action() { // 익명 클래스 : 한번만 쓰고 안쓸때
            // 이 클래스에서만 사용할 때 
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
