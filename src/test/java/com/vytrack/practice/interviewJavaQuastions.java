package com.vytrack.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class interviewJavaQuastions {
    public static void main(String[] args) {










    }
    public static int returnLargest(Integer[]b, int total) {
        List<Integer> list1 = Arrays.asList(b); Collections.sort(list1);
        int largest = list1.get(total-1);
        return largest;
    }


    public static int swapTwoNum(int a, int b){

        b=(a+b)-(a=b);

        System.out.println("b is :"+b);
        System.out.println("a is :"+a);

        return b;
    }



    public static int SumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static int factorialSum(int num) {

        int factorialSum = 1;
        for (int i = 1; i <= num; i++) {
            factorialSum = factorialSum * i;
        }

        return factorialSum;
    }

    public static String reverse(String str) {
        String reverse = "";
        List <Character> arrList = new ArrayList <>();
        char[] c = str.toCharArray();
        for (char each : c) {
            arrList.add(each);
        }
        Collections.reverse(arrList);

        for (int i = 0; i < arrList.size(); i++) {
            reverse += arrList.get(i);
        }

        return reverse;
    }

    public static String reverseString(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);

    }
}
