package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<>();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String d = list.get(i);
            if (d.length() % 2 == 0)
               newList.add(d + " " + d);
             else newList.add(d + " " + d + " " + d);

        }

//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
