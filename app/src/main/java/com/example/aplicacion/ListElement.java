package com.example.aplicacion;

public class ListElement {

    public String color;
    public String country;
    public String city;
    public String estatus;

    public ListElement(String color, String country, String city, String estatus) {
        this.color = color;
        this.country = country;
        this.city = city;
        this.estatus = estatus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

