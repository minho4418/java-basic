package chapter5;

public class ArrayEx2 {
    public static void main(String[] args){
        int sum = 0;
        double average = 0;

        int[] score = new int[]{100,88,100,100,90};

        for(int i = 0;i<score.length;i++){
            sum = sum + score[i];
        }
        average = sum / (double)score.length;

        System.out.println("총점:"+sum);
        System.out.println("평균:"+average);
    }
}
