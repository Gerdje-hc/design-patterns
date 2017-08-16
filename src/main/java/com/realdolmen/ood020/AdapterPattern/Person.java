package com.realdolmen.ood020.AdapterPattern;

import java.time.LocalDate;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Person implements BirthDate {

    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    private LocalDate birthdate;

}
