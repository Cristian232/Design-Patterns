package com.company.Creational.Builder;

public class UserWebDTO implements UserDTO{

    private String name;

    private String address;

    private String age;

    public UserWebDTO(String name,String address,String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public String getAge() {
        return null;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
