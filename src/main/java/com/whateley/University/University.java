package com.whateley.University;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniId;
    private String name;
    private String address;
    private String city;
    private String country;

    public University(){}

    public University(Long uniId, String name, String address, String city, String country) {
        this.uniId = uniId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public Long getId() {
        return uniId;
    }

    public void setId(Long uniId) {
        this.uniId = uniId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
