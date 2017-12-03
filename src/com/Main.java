package com;


import com.Cat;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Barsik barsik1 = new Barsik(4,"l","m");
        Barsik barsik2 = new Barsik(4,"l","m");

        System.out.println(barsik1 == barsik2);
        System.out.println(barsik1.equals(barsik2));
    }
}

//ИКУЛС.