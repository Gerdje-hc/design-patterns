package com.realdolmen.ood020.builder;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public abstract class EmailFormat {
    // This is abstract Builder

    public abstract void createFrom(String from);
    public abstract void createTo(String to);
    public abstract void createSubject(String subject);
    public abstract void createBody(String body);

    }

