package com.company.Creational.AbstractFactory.AbstractFactoryExercise1;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip enemyShip = null;

        if (newShipType.equals("U")){
            return new UFOEnemyShip();
        } else if (newShipType.equals("R")){
            return new RocketEnemyShip();
        } else if (newShipType.equals("B")){
            return new BigUFOEnemyShip();
        }
        else return null;

    }

}
