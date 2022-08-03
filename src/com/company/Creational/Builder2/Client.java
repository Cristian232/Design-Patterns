package com.company.Creational.Builder2;

import com.company.Creational.Builder.Address;
import com.company.Creational.Builder.User;

import java.time.LocalDate;

import static com.company.Creational.Builder.Client.createUser;
import static com.company.Creational.Builder2.UserDTO.UserDTOBuilder;

public class Client {




    public static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withBirthday(user.getBirthDay()).withAddress(user.getAddress()).build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthDay(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipCode("47998");
        user.setAddress(address);
        return user;
    }

}

