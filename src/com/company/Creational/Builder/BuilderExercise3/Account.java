package com.company.Creational.Builder.BuilderExercise3;

public class Account {

    private int id;
    private String email;
    private Name name;
    private Address address;

    private Account(Builder builder){
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static class Builder {

        private int id;
        private String email;
        private Name name;
        private Address address;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        public Builder name(Address address) {
            this.address = address;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name=" + name +
                ", address=" + address +
                '}';
    }
}
