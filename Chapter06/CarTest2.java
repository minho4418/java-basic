package chapter6;

class Car2{
    String color;
    String gearType;
    int door;

    Car2(){       // 매개변수가 없는 생성자
        this("blue","auto",4);   // Car(String c , String g, int d)호출
    }

    Car2(Car2 c){   // 인스턴스의 복사를 위한 생성자
        this(c.color,c.gearType, c.door);
    }

    //Car2(String c, String g, int d){    // 매개변수가 있는 생성자
    //    color = c;
    //    gearType = g;
    //    door = d;
    //}

    Car2(String color, String gearType, int door){    // 매개변수가 있는 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args){
        Car2 c1 = new Car2();
        //c1.color = "white";
        //c1.gearType = "auto";
        //c1.door = 4;

        Car2 c2 = new Car2(c1);

        System.out.println("c1 = "+c1.color+c1.gearType+c1.door);
        System.out.println("c2 = "+c2.color+c2.gearType+c2.door);
        c1.door = 100;

        System.out.println("c1 = "+c1.color+c1.gearType+c1.door);
        System.out.println("c2 = "+c2.color+c2.gearType+c2.door);
    }
}
