package chapter6;

class Car{
    String color;
    String gearType;
    int door;

    Car(){       // 매개변수가 없는 생성자
        this("blue","auto",4);   // Car(String c , String g, int d)호출
    }

    Car(String color){
        this(color, "auto", 2);
    }

    //Car(String c, String g, int d){    // 매개변수가 있는 생성자
    //    color = c;
    //    gearType = g;
    //    door = d;
    //}

    Car(String color, String gearType, int door){    // 매개변수가 있는 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car();
        //c1.color = "white";
        //c1.gearType = "auto";
        //c1.door = 4;

        Car c2 = new Car("white","auto",3);
        Car c3 = new Car("red");

        System.out.println("c1 = "+c1.color+c1.gearType+c1.door);
        System.out.println("c2 = "+c2.color+c2.gearType+c2.door);
        System.out.println("c3 = "+c3.color+c3.gearType+c3.door);
    }
}
