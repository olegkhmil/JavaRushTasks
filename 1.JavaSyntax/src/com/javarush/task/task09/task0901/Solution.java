package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.


Требования:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать свой StackTrace.
4. Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] elements1 = Thread.currentThread().getStackTrace();
        return elements1;
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements2 = Thread.currentThread().getStackTrace();
        return elements2;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] elements3 = Thread.currentThread().getStackTrace();
        return elements3;
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] elements4 = Thread.currentThread().getStackTrace();
        return elements4;
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] elements5 = Thread.currentThread().getStackTrace();
        return elements5;
    }
}
