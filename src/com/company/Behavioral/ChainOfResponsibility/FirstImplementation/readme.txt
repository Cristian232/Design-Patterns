


            Chain of Responsibility design pattern

        Definition:
            We create objects which are chained together by one object knowing the reference to another object which
                is the next object in the chain. If the first object can't handle the request it simply passes the req down the chain

        Use:

        Example: How_to

            Step 1: Define the handler interface / abstract class
            Step 2: Handler must define a method to accept requests
            Step 3: Handler can define method to access successor in chain
            Step 4: Implement handler in one or more concrete handler
            Step 5: Concrete handler should check if it can handle incoming req, if not should pass it to next handler
            Step 6:
            Step 7:
            Step 8:

        In main:
