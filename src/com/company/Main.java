package com.company;

import com.company.Creational.Builder.*;

public class Main {

    public static void main(String[] args) {

        //Builder implementation

        User user = new Director().createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = new Director().directBuild(builder,user);

        System.out.println(dto);

    }

}
