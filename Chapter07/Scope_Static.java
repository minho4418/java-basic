public class Scope_Static {
    int globalScope = 10; // globalScope는 클래스 전체가 사용범위
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        //System.out.println(localScope); // 사용불가
        //System.out.println(value); // 사용불가
    }

    public static void main(String[] args){
        //System.out.println(globalScope); // static때문에 오류가남.
        // static을 사용하면 인스턴스화 하지 않아도 사용가능
        System.out.println(staticVal);

        Scope_Static s1 = new Scope_Static();
        System.out.println(s1.globalScope);
        Scope_Static s2 = new Scope_Static();
        s1.globalScope = 10;
        s2.globalScope = 20;
        System.out.println(s1.globalScope);
        System.out.println(s2.globalScope);
        s1.staticVal = 50;
        s2.staticVal = 100;
        System.out.println(s1.staticVal);
        System.out.println(s2.staticVal);
        // static한 변수는 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유
        System.out.println(Scope_Static.staticVal); // 이게 조금더 바람직.
    }
}
