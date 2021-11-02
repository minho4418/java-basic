public class Types {
    public static void main(String[] args) {
        boolean isFun = true; // false, true 두 가지 값만
        //System.out.println(isFun);
        
        char c = 'f'; // 문자 하나만
        //System.out.println(c);

        int x = 59; // 정수형 byte -> short -> char -> int -> long
        //System.out.println(x);

        long bing = 22222222222L; // long은 숫자 맨뒤에 L넣어줘야함.

        double y = 55.555; // 실수형 float -> double
        //System.out.println(y);

        //---------------------------------------------------//
        // 타입변환
        int a = 50000;
        long b = a; // 작은걸 큰곳으로 가능!

        long a2 = 5;
      //  int b2 = a2; // 타입이 큰곳에서 작은곳으로 불가능!
        int b2 = (int)a2; // 강제 형변환으로 가능!
    }
}