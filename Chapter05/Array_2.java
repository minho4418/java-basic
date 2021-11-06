public class Array_2 {
    public static void main(String[] args){
        // 2차원 배열
        int[][] array1 = new int[3][4];
        array1[0][1] = 10;

        int[][] array2 = new int [3][];
        array2[0] = new int[1]; // 열의 개수를 설정할 수 있다.
        array2[1] = new int[2];

        array2[0][0] = 10;

        int[][] array3 = {{1},{1,2},{1,2,3}}; // 초기화 동시에 값 만들기
        System.out.println(array3[0][0]);
        System.out.println(array3[2][2]);
    }
}
