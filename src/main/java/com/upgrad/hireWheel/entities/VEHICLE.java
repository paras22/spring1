package com.upgrad.hireWheel.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name="Vehicle")

public class VEHICLE {
   @Id
   @GeneratedValue
   private int vehicleId;

   public int getVehicleId() {
      return vehicleId;
   }

   public void setVehicleId(int vehicleId) {
      this.vehicleId = vehicleId;
   }

   public String getVehicleModel() {
      return vehicleModel;
   }

   public void setVehicleModel(String vehicleModel) {
      this.vehicleModel = vehicleModel;
   }

   public String getVehicleNumber() {
      return vehicleNumber;
   }

   public void setVehicleNumber(String vehicleNumber) {
      this.vehicleNumber = vehicleNumber;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getCarImageUrl() {
      return carImageUrl;
   }

   public void setCarImageUrl(String carImageUrl) {
      this.carImageUrl = carImageUrl;
   }

   public VEHICLE_SUBCATEGORY getVehicleSubCategory() {
      return vehicleSubCategory;
   }

   public void setVehicleSubCategory(VEHICLE_SUBCATEGORY vehicleSubCategory) {
      this.vehicleSubCategory = vehicleSubCategory;
   }

   public Users getUser() {
      return user;
   }

   public void setUser(Users user) {
      this.user = user;
   }

   public FUEL_TYPE getFuelType() {
      return fuelType;
   }

   public void setFuelType(FUEL_TYPE fuelType) {
      this.fuelType = fuelType;
   }

   public LOCATION getLocation() {
      return location;
   }

   public void setLocation(LOCATION location) {
      this.location = location;
   }

   public List<BOOKING> getBookings() {
      return bookings;
   }

   public void setBookings(List<BOOKING> bookings) {
      this.bookings = bookings;
   }

   public int getAvailabilityStatus() {
      return availabilityStatus;
   }

   public void setAvailabilityStatus(int availabilityStatus) {
      this.availabilityStatus = availabilityStatus;
   }

   @Column(nullable = false)
   private String vehicleModel;

   @Column(nullable = false, unique = true)
   private String vehicleNumber;

   @Column(nullable = false)
   private String color;

   @Column(nullable = false)
   private String carImageUrl;


   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
   @JoinColumn(name = "vehicleSubCategoryId")
   private VEHICLE_SUBCATEGORY vehicleSubCategory;

   @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
   @JoinColumn(name = "userId")
   private Users user;

   @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
   @JoinColumn(name = "fuelTypeId")
   private FUEL_TYPE fuelType;

   @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
   @JoinColumn(name = "locationId")
   private LOCATION location;

   @OneToMany(mappedBy = "vehicle", fetch = FetchType.EAGER,  cascade = CascadeType.MERGE)
   private List<BOOKING> bookings;

   @Column( precision=1, nullable = false)
   private int availabilityStatus;
    
}