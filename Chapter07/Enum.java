public class Enum {
    // 열거형(enum)
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";
    public static void main(String[] args){
        String gender1;
        gender1 = Enum.MALE;
        gender1 = Enum.FEMALE;

        gender1 = "boy"; // male, female만 사용하고 싶은데
        // string타입이므로 다른 문자가 들어가도 오류가 안남.

        Gender gender2; // enum을 타입으로
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // gender2 = "boy"; // 에러
    }
}
enum Gender{
    MALE,FEMALE;
}