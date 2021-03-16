package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        summation(numbers);

    }
    static int summation(int[] numbers){
        int sum = 0;
        for (int x: numbers) {
            sum = sum + x;
        }
        System.out.println(sum);
        return sum;
    }
}
