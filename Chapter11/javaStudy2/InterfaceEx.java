package javaStudy2;

public class InterfaceEx {
    public static void main(String[] args){
        Interface tv = new LedTV();
        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();
    }
}
