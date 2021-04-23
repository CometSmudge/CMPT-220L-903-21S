package com.company;

public class Main {

    public static void main(String[] args) {
        int[] bubblelist = {7, 3, 9, 5};
        int a = 0;
        int b = 0;
        for (int x : bubblelist) {
            if(bubblelist[x] > bubblelist[x + 1]){
                a = bubblelist[x];
                b = bubblelist[x+1];
                bubblelist[x] = b;
                bubblelist[x + 1] = a;
            }
        }


    }
}