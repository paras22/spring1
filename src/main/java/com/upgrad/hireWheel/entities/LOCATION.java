package com.upgrad.hireWheel.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name="location")


public class LOCATION {
    @Id
    private int locationId;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public List<VEHICLE> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VEHICLE> vehicles) {
        this.vehicles = vehicles;
    }

    public List<BOOKING> getBookings() {
        return bookings;
    }

    public void setBookings(List<BOOKING> bookings) {
        this.bookings = bookings;
    }

    public CITY getCity() {
        return city;
    }

    public void setCity(CITY city) {
        this.city = city;
    }

    @Column( nullable = false)
    private String locationName;

    @Column( nullable = false)
    private String address;

    @Column( nullable = false)
    private int pincode;

    @OneToMany( mappedBy = "location",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<VEHICLE> vehicles;

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<BOOKING> bookings;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private CITY city;


}


