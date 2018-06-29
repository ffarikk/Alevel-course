package com.company.practis1;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random chislo = new Random();
        int K = input.nextInt();
        int n = input.nextInt();
        int[] mas = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mas[i] = chislo.nextInt();
            System.out.println(mas[i]);
            sum = sum + mas[i];
            if (sum % K == 0) System.out.println("Chislo kratnoye " + K + " " + " ravnyayetsa" + sum);
        }
    }
}
