


        Prototype Design Pattern

        Definition: Prototype is a creational design pattern that allows cloning objects,
                    even complex ones, without coupling to their specific classes.

        Use: When a system should be independent of how its products are created, composed, and represented

        Example: How_to

            Step 1: Create a Book class with 2 private props, int bid and String bname
            Step 2: Create a BookShop class with 2 private props, String shopName and arraylist books
            Step 3: Add getters and setters / also toString
            Step 4: Add void loadBooks method in BookShop to populate with a for i books with some values
            Step 5: Implement Cloneable in BookShop class and override clone method
            Step 6: In main, create a Bookshop 2 with a shallow copy of bookshop 1, cast to BookShop and add exception throws CloneNotSupported


        In main:
                    BookShop bookShop1 = new BookShop();
                    bookShop1.setBookShop("BookShop 1");
                    bookShop1.loadBooks();
                    System.out.println(bookShop1.toString());

                    BookShop bookShop2 = (BookShop) bookShop1.clone();