public class controlStatement {
    public static void main(String[] arg) {
// if 문
        int x = 50;
        int y = 60;

//        if(x < y){
//          System.out.println("x는 y 보다 작습니다.");
//       }

        if(x == y){
            System.out.println("x는 y와 같습니다.");
        }else if(x < y){
            System.out.println("x와 y는 작습니다.");
        }else{
            System.out.println("x 는 y와 다릅니다.");
        }

// switch, case, default, break

        int value = 1;

        switch(value){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default :
                System.out.println("그 외 다른 숫자");
        }

        String str = "A";
        switch (str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
        }

    }

}
