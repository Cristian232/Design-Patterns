package com.company;


import com.company.Creational.Builder.User;
import com.company.Creational.Builder2.*;

import static com.company.Creational.Builder2.Client.createUser;
import static com.company.Creational.Builder2.Client.directBuild;

public class Main {

    public static void main(String[] args) {

        //Builder2 implementation

       Client client = new Client();
        User user = createUser();
        // Client has to provide director with concrete builder
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);

        System.out.println(dto);

    }

}
