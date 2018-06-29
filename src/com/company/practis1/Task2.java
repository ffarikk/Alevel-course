package com.company.practis1;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

class Task2 {
    public static void main(String[] args) throws IOException {
        int[] array = { 1, 2, 4, 0, 5, 0, 4, 0, 2, 5, 0 };
        int[] result = IntStream.range(0, array.length).filter(index -> array[index] == 0).toArray();
        System.out.println(Arrays.toString(result));
    }
}