package ksn.example;


import lombok.Getter;
import lombok.Setter;

@Getter
public class Person {


    @Setter private String name;

    @Setter
    private String surname;


    private String id;

}
