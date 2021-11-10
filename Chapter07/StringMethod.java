public class StringMethod {
    public static void main(String[] args){
        // String의 메소드
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world")); // 이것만 하면 바뀌지는 않음.
        System.out.println(str);
        str = str.concat(" world");
        System.out.println(str);

        System.out.println(str.substring(3)); // 3번이후 부터 출력
        System.out.println(str.substring(3, 6)); // 3번부터 6번까지 출력
    }
}
