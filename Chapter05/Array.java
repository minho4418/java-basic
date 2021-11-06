public class Array {
    public static void main(String[] args){
        int[] array1 = new int[100]; // 100길이의 배열 생성

        //array1[0] = 50;
        //array1[10] = 100;

        int[] array2 = new int[]{1,2,3,4};

        int[] array3 = {1,2,3,4};

        System.out.println(array3[1]);
        int value = array3[0];

        System.out.println(value);

        for(int i = 0; i < array1.length; i++){
            array1[i] = i + 1;
        }

        int sum = 0;
        for(int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
        System.out.println(sum);
    }
}
