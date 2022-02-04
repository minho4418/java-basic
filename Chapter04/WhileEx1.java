package chapter4;

public class WhileEx1 {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;

        while((sum += ++i) <= 6000){
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
