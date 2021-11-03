public class Operations_2 {
    public static void main(String[] arg) {
        // 비교 연산자
        int i = 10;
        int j = 10;

        System.out.println(i==j);
        System.out.println(i != j); // 두개가 다릅니까?
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i >= j);

        i += 10; // i = i + 10;

        // 연산자 우선순위
        // 1. ., [], ()
        // 2. ++,==,!,~,:,+/-
        
        // 논리 연산자
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
        System.out.println(b1 || b2); // 둘중 하나만 true 여도 true
        System.out.println(b1 ^ b2); // 둘이 다를 때 true
        System.out.println(!b1); // 반대의 값을 말해줌. true면 false
        
        // 삼항 연산자
        int a1 = (5 > 4) ? 50 : 40; // (5 > 4) 가 맞다면 50, 틀리면 40
        System.out.println(a1);
        
        // if 문으로 가능
        int a2 = 0;
        if(5 < 4){
            a2 = 50;
        }
        else{
            a2 = 40;
        }

        System.out.println(a2);
    }
}
