


                Object Pool Design Pattern

        Definition: In our system if the cost of creating an instance of a class is high and we need a large amount of obj
                        of this type for a short time

        Use:

        Example: How_to

            Step 1: Thread safe caching in memory for objects should be done in the pool
            Step 2: Methods to acquire and release the objects should be provided and pool should
                       reset cached objects before giving them out
            Step 3: Reusable obj must provide reset method to reset it's state upon release


        In main:
