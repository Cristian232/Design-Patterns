

    Builder Pattern Exercise 3

    Definition:
    Builder is a creational design pattern that lets you construct complex objects step by step.
    Also refers to it as method chaining.  The intent of the Builder design pattern is to
    separate the construction of a complex object from its representation.

    Use:
    In obj creation with multiple params, it increases usability and readability

    Example: How_to

    Step 1: Create 3 classes Account, Name, Address
    Step 2: Add to Account class private props int id, String email, Name name, Address address
    Step 3: Add to Account class private constructor with param Builder builder also generate getters after constructor
    Step 4: Add to Account class public static class Builder with same 4 props as Account
    Step 5: Add to Builder class public method with Builder return type for each of the props, that sets them and returns this
    Step 6: Add to Builder class a method build that returns a new Account with param this
    Step 7: Set Account props in private constructor from Step 2 from builder param


