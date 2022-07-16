package org.example;


public class PersonBilderImpl {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;


    private Person newPerson;


    public PersonBilderImpl setPersonName(String name) {
        this.name = name;
        return this;
    }

    public PersonBilderImpl setPersonSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBilderImpl setPersonAge(int age) {
        if (age > 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Ошибка ,возраст не подходит ");
        }
    }

    public PersonBilderImpl setPersonCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (this.getAge() == 0 ||
                this.getName().equals(null) ||
                this.getSurname().equals(null)) {
            throw new NullPointerException("Поля не заполнены");
        } else {
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Person getNewPerson() {
        return newPerson;
    }
}
