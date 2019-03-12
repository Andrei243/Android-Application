package com.example.mandelsapplication;


public class KitesufingLocation {
       private String location;
       private String country;
       private Double latitude;
       private double longitude;
       private double windProbability;
       private String whenToGo;
       private boolean eFavorit;

    public KitesufingLocation(String location, String country, Boolean eFavorit) {
        this.location = location;
        this.country = country;
        this.eFavorit = eFavorit;
    }

    public KitesufingLocation(String location, String country, Double latitude, double longitude, double windProbability, String whenToGo, Boolean eFavorit) {
        this.location = location;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.windProbability = windProbability;
        this.whenToGo = whenToGo;
        this.eFavorit = eFavorit;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getWindProbability() {
        return windProbability;
    }

    public String getWhenToGo() {
        return whenToGo;
    }

    public Boolean geteFavorit(){
        return eFavorit;
    }
}
