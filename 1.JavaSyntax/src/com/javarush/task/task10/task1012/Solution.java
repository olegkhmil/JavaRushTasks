package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита).
Результат вывести на экран в алфавитном порядке.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9


Требования:
1.	Программа должна 10 раз считывать данные с клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Выведенный текст должен содержать 33 строки.
4.	Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        String q = "";
        for (String n : list) {
            q = q + n;
        }

        char[] ch = q.toCharArray();

        for (int t = 0; t < abcArray.length; t++) {
            int b = 0;

            for (int i = 0; i < ch.length; i++) {
                if (abcArray[t] == ch[i]) b = b + 1;
            }
            System.out.println(abcArray[t] + " " + b);
        }
    }
}


