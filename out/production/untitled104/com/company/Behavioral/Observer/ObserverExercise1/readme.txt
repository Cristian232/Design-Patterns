




                      Observer design pattern



        Example: How_to

            Step 1:  Concrete classes Channel and Subscriber
            Step 2:  Interfaces Subject and Observer
            Step 3:  Subject methods - notify, subscribe, unsubscribe, upload
            Step 4:  Observer methods - subscribe, update


        In main:

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
