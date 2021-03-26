package homework1.additionaltask;

import java.util.Scanner;

public class Adress {
    String country, city, street;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    int apartment, index, house;

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void showAdress() {
        System.out.println("Your adress is : " + this.country +" "+ this.city +" "+  this.street + " "+ this.index + " "+ this.house +" "+  this.apartment);
    }

}


