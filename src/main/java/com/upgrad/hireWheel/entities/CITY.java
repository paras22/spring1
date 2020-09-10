package com.upgrad.hireWheel.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="City")


public class CITY {
    @Id
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<LOCATION> getLocations() {
        return locations;
    }

    public void setLocations(List<LOCATION> locations) {
        this.locations = locations;
    }

    @Column( nullable = false)
    private String cityName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<LOCATION> locations;
}
