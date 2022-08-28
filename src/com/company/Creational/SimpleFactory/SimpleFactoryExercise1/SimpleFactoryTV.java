package com.company.Creational.SimpleFactory.SimpleFactoryExercise1;

public class SimpleFactoryTV {

    public static ITV getTV(String tvmode){

        if(tvmode.equals("LED")){
            return new ITV() {
                @Override
                public void createTV() {
                    System.out.println("Brand new LED TV :D");
                }
            };
        }else if (tvmode.equals("LCD")) {
            return new ITV() {
                @Override
                public void createTV() {
                    System.out.println("Brand new LCD TV :)");
                }
            };
        }else {
            return new ITV() {
                @Override
                public void createTV() {
                    System.out.println("Other type of TV :(");
                }
            };
        }

    }

}
