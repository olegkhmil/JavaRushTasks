package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        double a = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
                break;
            a = a + number;
            count++;
        }
        System.out.println(a / count);
    }
}

