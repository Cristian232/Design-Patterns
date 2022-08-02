package com.company.Creational.Builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withAddress(Address address);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTO build();

    UserDTO getUserDTO();
}
