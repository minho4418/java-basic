package chapter2;

public class OperatorEx {
    public static void main(String[] args){
        int x,y,z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        System.out.printf("x=%d%n",absX);
        System.out.printf("x=%d%n",absY);
        System.out.printf("x=%d%n",absZ);
    }
}
