package com.vytrack.practice;

public class javaPractice {
    public static void main(String[] args) {

        System.out.println(reverse(124));

    }

    public static int reverse(int num){
        int reverse = 0;
        int remainder=0;

        while (num>0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }
       return reverse;
    }
}
