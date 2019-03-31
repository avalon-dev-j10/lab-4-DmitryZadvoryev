package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class User implements Person{
    
    private String name;
    private Date birthDate;

    public User(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Date getBirthDate() {
        return birthDate;
    }
}
