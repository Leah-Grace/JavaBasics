package com.LeahGrace;

public class Main {

    static void createFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }
    public static void main(String[] args) {
        String firstName = "Leah";
        String lastName = "Grace";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        createFullName("Gabriel", "Sherman");
        createFullName("Marguerite", "Blair");
        }
    }

