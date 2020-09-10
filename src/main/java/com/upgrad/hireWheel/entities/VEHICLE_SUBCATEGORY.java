package com.upgrad.hireWheel.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name="Vehicle_Subcategory")


public class VEHICLE_SUBCATEGORY {

   @Id
   private int vehicleSubCategoryId;

   @Column( nullable = false, unique = true)
   private String vehicleSubCategoryName;

   public int getVehicleSubCategoryId() {
      return vehicleSubCategoryId;
   }

   public void setVehicleSubCategoryId(int vehicleSubCategoryId) {
      this.vehicleSubCategoryId = vehicleSubCategoryId;
   }

   public String getVehicleSubCategoryName() {
      return vehicleSubCategoryName;
   }

   public void setVehicleSubCategoryName(String vehicleSubCategoryName) {
      this.vehicleSubCategoryName = vehicleSubCategoryName;
   }

   public int getPricePerHour() {
      return pricePerHour;
   }

   public void setPricePerHour(int pricePerHour) {
      this.pricePerHour = pricePerHour;
   }

   public List<VEHICLE> getVehicle() {
      return vehicle;
   }

   public void setVehicle(List<VEHICLE> vehicle) {
      this.vehicle = vehicle;
   }

   public VEHICLE_CATEGORY getVehicleCategory() {
      return vehicleCategory;
   }

   public void setVehicleCategory(VEHICLE_CATEGORY vehicleCategory) {
      this.vehicleCategory = vehicleCategory;
   }

   @Column( nullable = false)
   private int pricePerHour;

   @OneToMany(mappedBy = "vehicleSubCategory", fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
   private List<VEHICLE> vehicle;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "vehicleCategoryId")
   private VEHICLE_CATEGORY vehicleCategory;
}
