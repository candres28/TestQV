package com.co.testing.test.models;

public class Data {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String computer;
    private String version;
    private String languages;
    private String city;
    private String zip;
    private String country;
    private String mobile;
    private String model;
    private String so;
    private String password;

    public Data(String firstName, String lastName, String email, String month, String day, String year, String city, String zip, String country, String computer, String version, String languages, String mobile, String model, String so, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.version = version;
        this.languages = languages;
        this.mobile = mobile;
        this.model = model;
        this.so = so;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getComputer() {
        return computer;
    }

    public String getVersion() {
        return version;
    }

    public String getLanguages() {
        return languages;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getMobile() {
        return mobile;
    }

    public String getModel() {
        return model;
    }

    public String getSo() {
        return so;
    }

    public String getPassword() {
        return password;
    }
}
