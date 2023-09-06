package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] N_array = new int[scanner.nextInt()];

        int N = 4;

        int[] number = new int[N];

        int max = 0;
        int maxID = 0;

        for(int i = 0; i < N_array.length;i++){
            N_array[i] = random.nextInt(N);
            number[N_array[i]]++;
        }

        for(int i = 0; i < number.length;i++){
            if(max < number[i]){
                max = number[i];
                maxID = i;
            }
        }

        if (max > (N_array.length / 2)){
            System.out.println(maxID);
        }
        else{
            System.out.println(-1);
        }
    }
}