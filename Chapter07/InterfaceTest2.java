package chapter7;

class A{
    void autoPlay(I i){
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B implements I{
    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I{
    @Override
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        a.autoPlay(b);
        a.autoPlay(new C());

    }
}
