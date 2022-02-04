package chapter4;

public class ForEx3{
    public static void main(String[] args){
        Loop : for(int i=2;i<=9;i++){    // for문에 이름 붙이기
            for(int j=1;j<=9;j++){
                if(j==5)
                    break Loop;
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
