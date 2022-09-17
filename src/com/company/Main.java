package com.company;


import com.company.Behavioral.Iterator.FirstImplementation.Iterator;
import com.company.Behavioral.Iterator.FirstImplementation.ThemeColor;

public class Main {

    public static void main(String[] args) {

        Iterator<ThemeColor> iterator = ThemeColor.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
