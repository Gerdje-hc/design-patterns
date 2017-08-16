package com.realdolmen.ood020.AdapterPattern;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(LocalDate.of(1990,
            Month.DECEMBER, 12));

VotingSystem votingSystem = new VotingSystem();
System.out.println(votingSystem.canVote(new Adaptor(person)));
    }
}
