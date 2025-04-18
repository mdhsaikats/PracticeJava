package org.example;

// Superclass
public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void purchaseParkingPass() {
        System.out.println(name + " has purchased a parking pass.");
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmailAddress() { return emailAddress; }

    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
}

