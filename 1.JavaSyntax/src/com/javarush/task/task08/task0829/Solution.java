package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap<String,String> map = new HashMap<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String city = reader.readLine();
            map.put(family,city);
        }

        // Read the house number
        String word = reader.readLine();
        for (Map.Entry<String,String> m : map.entrySet()) {
            if (word.equalsIgnoreCase(m.getValue())) {

                System.out.println(m.getKey());
            }
            if(word.equalsIgnoreCase(m.getKey())){
                System.out.println(m.getValue());
            }
        }

    }
}
