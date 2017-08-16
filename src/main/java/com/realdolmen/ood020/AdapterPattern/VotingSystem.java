package com.realdolmen.ood020.AdapterPattern;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class VotingSystem {    // this is the Client

    public boolean canVote (Age age) {
        return age.getAge () >= 18;
    }

}
