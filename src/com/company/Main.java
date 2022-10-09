package com.company;


import com.company.Behavioral.Observer.ObserverExercise1.Channel;
import com.company.Behavioral.Observer.ObserverExercise1.Subscriber;

public class Main {

    public static void main(String[] args) {

        Channel youtubeWWE = new Channel();

        Subscriber subscriber1 = new Subscriber("Dave Batista");
        Subscriber subscriber2 = new Subscriber("John Cena");
        Subscriber subscriber3 = new Subscriber("Undertaker");

        youtubeWWE.subscribe(subscriber1);
        youtubeWWE.subscribe(subscriber2);
        youtubeWWE.subscribe(subscriber3);

        youtubeWWE.unsubscribe(subscriber2);

        subscriber1.subscribe(youtubeWWE);
        subscriber2.subscribe(youtubeWWE);
        subscriber3.subscribe(youtubeWWE);

        youtubeWWE.upload("Mania now");



    }

}
