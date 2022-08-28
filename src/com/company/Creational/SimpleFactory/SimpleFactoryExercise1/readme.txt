

        Simple Factory design pattern Exercise 1

        Definition:
            The simple factory is essentially a class that, based on a given input, returns objects of different types.
            The simple factory is just the concrete factory, without the extra factory
                class abstraction found in either the factory method or abstract factory.


        Use:
            Simple factory generates an instance of an object/service for client without exposing any implementation to the client.

        Example: How_to

            Step 1: Create an interface ITV with void method createTV()
            Step 2: Create class SimpleFactoryTV
            Step 3: Add to SimpleFactoryTV static method getTV with a String param and ITV return type
            Step 4: Add to getTV if logic to implement createTV() and sout message based on param type


        In main:
            SimpleFactoryTV.getTV("LED").createTV();