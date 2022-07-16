package org.example;

import javax.imageio.IIOException;

public class Main {
    public static void main(String[] args) throws Exception, IIOException {
        System.out.println("Hello world!");

        Person pers = new PersonBilderImpl()
                .setPersonName("Alex")
                .setPersonSurname("Bulgakov")
                .setPersonAge(3)
                .setPersonCity("SPb")
                .build();

        System.out.println(pers);


        pers.happyBirthday();

        Person son = pers.newChildBilder()
                .setPersonName("Artem")
                .setPersonAge(8)
                .build();
        System.out.println(son);

        try {
            Person pop = new PersonBilderImpl()
                    .setPersonName("Dima")
                    //.setPersonSurname("f")
                    .setPersonAge(8)
                    .setPersonCity("Moscow")
                    .build();
            System.out.println(pop);
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
            System.out.println("Заполните все данные ");
        }

    }
}

