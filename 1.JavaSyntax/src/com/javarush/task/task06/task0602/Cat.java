package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    //напишите тут ваш код
    public void finalize(){
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    //напишите тут ваш код
    String name;
    public void finalize(){
        System.out.println("A Dog was destroyed");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
