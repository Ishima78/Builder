package org.example;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected final String city;

    protected Person(PersonBilderImpl personBilder) {
        this.name = personBilder.getName();
        this.surname = personBilder.getSurname();
        this.age = personBilder.getAge();
        this.city = personBilder.getCity();
    }

    //public void setName(String name) {
    //    this.name = name;
    //}

    //public void setSurname(String surname) {
    //    Surname = surname;
    //}

    //public void setAge(int age) {
    //    this.age = age;
    //}

    // public void setCity(String city) {
    //     this.city = city;
    // }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public PersonBilderImpl newChildBilder() {
        return new PersonBilderImpl()
                .setPersonSurname(getSurname())
                .setPersonCity(getCity());

    }

    public boolean hasAge() {
        if (age < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void happyBirthday() {
        if (age == getAge()) {
            age++;
            System.out.println(age);
        }
    }

}
