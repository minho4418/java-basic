package chapter7;

public class SuperTest2 {
    public static void main(String[] args){
        Point3D p = new Point3D();
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.z);
    }
}

class Point1 {
    int x = 10;
    int y = 20;

    Point1(int x , int y ){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point1{
    int z = 30;

    Point3D(){
        this(100,200,300);
    }
    Point3D(int x, int y , int z){
        super(x,y);
        this.z = z;
    }
}
