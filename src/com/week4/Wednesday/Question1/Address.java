package com.week4.Wednesday.Question1;

import java.io.Serializable;

public class Address implements Serializable {
    String Email;
    transient String Password;


    public Address(String state, String city) {
        this.Email = state;
        this.Password = city;

    }
}
