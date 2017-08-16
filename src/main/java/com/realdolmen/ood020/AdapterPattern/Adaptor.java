package com.realdolmen.ood020.AdapterPattern;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Adaptor implements Age {

    private BirthDate birthDate;
    public Adaptor(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    public long getAge() {
        return ChronoUnit.YEARS.between (
            birthDate.getBirthdate(), LocalDate.now());

        }
    }



