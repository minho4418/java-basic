package chapter7;

public class InterfaceTest1 {
    public static void main(String[] args){
        Inter i = new Inter();

        if(i instanceof Unit){
            System.out.println("i 는 Unit클래스의 자손입니다.");
        }
        if(i instanceof Intertable){
            System.out.println("i 는 Intertable클래스의 자손입니다.");
        }
        if(i instanceof Movable){
            System.out.println("i 는 Movable클래스의 자손입니다.");
        }
        if(i instanceof Attachable){
            System.out.println("i 는 Attachable클래스의 자손입니다.");
        }
        if(i instanceof Object){
            System.out.println("i 는 Object클래스의 자손입니다.");
        }
        System.out.println(i.currentHP);
        i.move(2,3);
    }
}


class Inter extends Unit implements Intertable{
    public void move(int x, int y){
        System.out.println(x*y);
    }
    public void attack(Unit u){

    }
}

class Unit{
    int currentHP = 1;
    int x;
    int y;
}

interface Intertable extends Movable, Attachable{}
interface Movable{
    void move(int x, int y);
    }
interface Attachable{
    void attack(Unit u);
}
