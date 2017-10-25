package com.whateley.University;

public final class UniversityBuilder {
    private Long uniId;
    private String name;
    private String address;
    private String city;
    private String country;

    private UniversityBuilder() {
    }

    public static UniversityBuilder anUniversity() {
        return new UniversityBuilder();
    }

    public UniversityBuilder withUniId(Long uniId) {
        this.uniId = uniId;
        return this;
    }

    public UniversityBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UniversityBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public UniversityBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public UniversityBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public University build() {
        return new University(uniId, name, address, city, country);
    }
}
