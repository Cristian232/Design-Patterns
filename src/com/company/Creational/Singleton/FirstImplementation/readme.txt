


                    Singelton design pattern

        Definition: A class that has only one instance, accessible globally through a single point (via method/field)

        Use: Ensures that there is only one instance of your application

        Example: How_to

            Step 1: Class constructor must not be accessible globally, subclassing/inheritance must not be allowed
            Step 2: Keeping track of the instance in the class
            Step 3: Easy Singleton, created at the beginning of the program &
                    Lazy Singleton, created when first required


        In main:
                    //Eager Singleton
                    EagerRegistry registry = EagerRegistry.getInstance();

                    //Lazy Singleton
                    LazyRegistry registry1 = LazyRegistry.getInstance();