package com.upgrad.hireWheel.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="FuelType")


public class FUEL_TYPE {
    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public List<VEHICLE> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VEHICLE> vehicles) {
        this.vehicles = vehicles;
    }

    @Id
    private int fuelTypeId;

    @Column( nullable = false)
    private String fuelType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fuelType")
    private List<VEHICLE> vehicles;
}
