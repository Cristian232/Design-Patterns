package com.company;


import com.company.Behavioral.Null.FirstImplementation.ComplexService;
import com.company.Behavioral.Null.FirstImplementation.NullStorageService;

import java.io.FileNotFoundException;

public class Main {



    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        ComplexService complexService1 = new ComplexService(new NullStorageService(), "Simple Report1");
        complexService1.generateReport();



    }

}
