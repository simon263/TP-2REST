package com.example.tp_2rest.model;

public class Country {
    private String commonName;
    private String officialName;
    private String capitalCity;
    private String currencyTrigram;
    private String currencyName;
    private String currencySymbol;
    private double latitude;
    private double longitude;
    private String flagUrl;

    public Country(String commonName, String officialName, String capitalCity, String currencyTrigram, String currencyName, String currencySymbol, double latitude, double longitude, String flagUrl) {
        this.commonName = commonName;
        this.officialName = officialName;
        this.capitalCity = capitalCity;
        this.currencyTrigram = currencyTrigram;
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
        this.latitude = latitude;
        this.longitude = longitude;
        this.flagUrl = flagUrl;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getCurrencyTrigram() {
        return currencyTrigram;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setCurrencyTrigram(String currencyTrigram) {
        this.currencyTrigram = currencyTrigram;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
}
