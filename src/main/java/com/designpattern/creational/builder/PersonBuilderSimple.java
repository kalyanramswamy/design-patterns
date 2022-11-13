package com.designpattern.creational.builder;

public class PersonBuilderSimple {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public PersonBuilderSimple(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.age = builder.age;
    }

    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;

        public Builder() {}

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilderSimple build() {
            return new PersonBuilderSimple(this);
        }
    }
}
