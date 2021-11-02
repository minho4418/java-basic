public class Operations {
    public static void main(String[] args){
        // 산술 연산자
        int i = -5;
        int i2 = +i;
        int i3 = -i2; // -붙이면 --만나면 +로 변함.

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3; // i3 = i3+1;
        System.out.println(i4);
        System.out.println(i3);

        int i5 = i3++;
        System.out.println(i5);
        System.out.println(i3);

        int a = 5;
        int b = 2;

        System.out.println(a / b); // 정수끼리 계산하면 정수값이 나옴
        System.out.println(a / (double)b); // 실수값으로 나옴
    }
}
