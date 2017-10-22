package com.whateley.University;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

    @Id
    private String Id;
    private String Name;
    private String Address;
    private String City;
    private String Country;

    public University(){}

    public University(String uniId, String name, String address, String city, String country) {
        Id = uniId;
        Name = name;
        Address = address;
        City = city;
        Country = country;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
