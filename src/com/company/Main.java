package com.company;


import com.company.Structural.Composite.FirstImplementation.BinaryFile;
import com.company.Structural.Composite.FirstImplementation.Director;
import com.company.Structural.Composite.FirstImplementation.File;

public class Main {

    private static File createTreeOne(){

        File file1 = new BinaryFile("Abc",1000);
        Director director1 = new Director("DEF");
        director1.addFile(file1);
        File file2 = new BinaryFile("Bcd",2000);
        File file3 = new BinaryFile("Cde",3000);
        Director director2 = new Director("EFG");
        director2.addFile(file2);
        director2.addFile(file3);
        director2.addFile(director1);

        return director2;
    };

    private static File createTreeTwo(){
        return new BinaryFile("Another file",200);
    }

    public static void main(String[] args) {

        File root1 = createTreeOne();
        root1.ls();
        System.out.println("************");
        File root2 = createTreeTwo();
        root2.ls();
    }



}
