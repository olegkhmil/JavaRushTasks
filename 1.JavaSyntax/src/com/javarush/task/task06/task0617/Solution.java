package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //напишите тут ваш код
    public static class Idea {
        String description = "new Idea";

        public String getDescription(){

            return description;
        }
        @Override
        public String toString(){
            return getDescription();
        }

    }

    public static void printIdea(Idea idea){

        System.out.println(idea);


    }
}
