package com.example.sasanya1;

public class Contributor {

    private String login;
    private int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")\n";
    }
}