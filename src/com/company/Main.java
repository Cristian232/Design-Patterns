package com.company;


import com.company.Creational.AbstractFactory.AbstractFactoryExercise1.EnemyShip;
import com.company.Creational.AbstractFactory.AbstractFactoryExercise1.EnemyShipFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip enemyShip = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to produce? (U/R/B)");

        if (scanner.hasNextLine()){
            String typeOfShip = scanner.nextLine();
            enemyShip = shipFactory.makeEnemyShip(typeOfShip);

            if (enemyShip != null){
               // doStuffEnemy(enemyShip);
            }

        }else {
            System.out.println( "Please enter U/R/B next time");
        }

    }

}
