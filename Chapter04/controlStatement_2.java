import java.util.Scanner;

public class controlStatement_2 {
    public static void main(String[] args) {
        // while문
        int x = 0;

        while (x < 10) {
            System.out.println(x);
            x++;
        }
        // int total = 0;
        // int a = 1;
        // while(a<=100){
        //    total = total + 1;
        //     a++;
        //}

        // System.out.println(total);

        // while(true){
        //    System.out.println("Hello");
        //}

        // do while문
      //  int value = 0;
       // Scanner scan = new Scanner(System.in);

      //  do {
      //      value = scan.nextInt();
      //      System.out.println("입력받은 값 :" + value);

      //  } while (value != 10);

       // System.out.println("반복문 종료");


        // for문
        int total = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                continue;
            }
            if(i == 50){
                break;
            }
            total = total + i;
        }
        System.out.println(total);
    }
}
