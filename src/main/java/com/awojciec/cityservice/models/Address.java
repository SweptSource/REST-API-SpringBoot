package com.awojciec.cityservice.models;

public class Address {

    private Long id;
    private String zipCode;
    private String countryCode;

    public Address() {
    }

    public Address(String zipCode, String countryShort) {
        this.zipCode = zipCode;
        this.countryCode = countryShort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryShort(String countryShort) {
        this.countryCode = countryShort;
    }
}
