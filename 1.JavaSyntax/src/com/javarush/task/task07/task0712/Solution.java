package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());

        int min = list.get(0).length();
        int max = list.get(0).length();
//        String sMin = list.get(0);
//        String sMax = list.get(0);




        for (int i = 0; i < list.size(); i++){
            if(min > list.get(i).length())
                min = list.get(i).length();

            if(max < list.get(i).length())
                max = list.get(i).length();
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() == min){
                System.out.println(list.get(i));
                break;
            }else if(list.get(i).length() == max){
                System.out.println(list.get(i));
                break;
            }
        }

    }
}
