package com.javarush.task.task12.task1225;

/* 
Посетители
Кот", "Тигр", "Лев", "Бык", "Корова", "Животное
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));


    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код




        if(o.getClass().equals(new Tiger().getClass()))return "Тигр";
        if(o.getClass().equals(new Lion().getClass()))return "Лев";
        if(o.getClass().equals(new Bull().getClass()))return "Бык";
        if(o.getClass().equals(new Cow().getClass()))return "Корова";

        if(o.getClass().equals(new Cat().getClass()))return "Кот";
        if(o.getClass().getSimpleName().equals(new Animal().getClass().getSimpleName()))return "Животное";

        return "qwe";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {

    }

    public static class Tiger extends Cat {

    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {

    }
}
