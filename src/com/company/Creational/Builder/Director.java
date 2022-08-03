package com.company.Creational.Builder;

import java.time.LocalDate;

public class Director {

//    //Builder implementation in main
//
//    User user = new Director().createUser();
//    UserDTOBuilder builder = new UserWebDTOBuilder();
//
//    UserDTO dto = new Director().directBuild(builder,user);
//
//    System.out.println(dto);

    public UserDTO directBuild(UserDTOBuilder builder ,User user){
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress()).withBirthday(user.getBirthDay())
                .build();
    }

    public User createUser(){
         User user = new User() ;
         user.setBirthDay(LocalDate.of(1960,5,6));
         user.setFirstName("Bill");
         user.setLastName("Michael");
         Address address = new Address();
         address.setHouseNumber("1");
         address.setStreet("Average st");
         address.setCity("Central");
         address.setState("FR");
         address.setZipCode("123456");
         user.setAddress(address);
         return user;
         };
}
