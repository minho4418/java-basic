package chapter6;

public class ReturnEx1 {
    public static void main(String[] args){
        ReturnEx1 r = new ReturnEx1();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b){
        return a+b;
    }

    void add(int a, int b, int[] result){
        result[0] = a+b;
    }
}
