package javaStudy;

public class CarEx {
    public static void main(String[] args){
        //Car c1 = new Car(); // Car() 생성자, 기본생성자 자동으로 만들어줌.
        // 생성자를 하나라도 만들면 기본생성자 만들어지지않음.
        Car c2 = new Car("소방차");
        Car c3 = new Car("구급차");

        System.out.println(c2.name);
    }
}
