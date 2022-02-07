package chapter6;

public class MemberCallEx { // 클래스, 인스턴스 간의 참조와 호출
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv;  에러, 클래스변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCallEx().iv; // 객체를 생성해야 사용가능.
    // -> MemberCallEx c = new MemberCallEx();
    // -> int cv2 = c.iv;

    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv); 에러, 클래스메서드에서 인스턴스변수를 사용불가.
        MemberCallEx c = new MemberCallEx();
        System.out.println(c.iv);
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); // 인스턴스에서 인스턴스변수 바로 사용가능
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1(); 클래스에서 인스턴스 호출불가.
        MemberCallEx c = new MemberCallEx();
        c.instanceMethod1();
    }

    void instanceMethod2(){
        staticMethod1(); // 인스턴스에서는 클래스 인스턴스 상관없이 모두 호출가능
        instanceMethod1();
    }
}
