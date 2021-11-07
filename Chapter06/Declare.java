public class Declare {
    public static  void main(String[] args){
        Declare c1 = new Declare(); // 객체(instance) 생성
        Declare c2 = new Declare(); // Car()은 생성자

        // 참조형(reference)
        int i = 4;
        String str = new String("hello");

        // String 클래스
        String  str1 = "hello"; // 상수의 영역으로 저장이됨.
        String  str2 = "hello";

        String str3 = new String("hello"); // heap 영역으로 저장이됨.
        String str4 = new String("hello");

        if(str1 == str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");

        if(str1 == str3) {
            System.out.println("ㅇ");
        }else{
            System.out.println("?");
        }
        if(str3 == str4)
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");
        
        System.out.println(str1.substring(3)); // .substring 지정까지 자르기
        System.out.println(str1);
    }
}
