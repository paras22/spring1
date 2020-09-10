package com.upgrad.hireWheel.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="Vehicle_Category")

public class VEHICLE_CATEGORY {
   @Id
   private int vehicleCategoryId;

   @Column( nullable = false , unique = true)
   private String vehicleCategoryName;

   public int getVehicleCategoryId() {
      return vehicleCategoryId;
   }

   public void setVehicleCategoryId(int vehicleCategoryId) {
      this.vehicleCategoryId = vehicleCategoryId;
   }

   public String getVehicleCategoryName() {
      return vehicleCategoryName;
   }

   public void setVehicleCategoryName(String vehicleCategoryName) {
      this.vehicleCategoryName = vehicleCategoryName;
   }

   public List<VEHICLE_SUBCATEGORY> getVehicleSubCategories() {
      return vehicleSubCategories;
   }

   public void setVehicleSubCategories(List<VEHICLE_SUBCATEGORY> vehicleSubCategories) {
      this.vehicleSubCategories = vehicleSubCategories;
   }

   @OneToMany(mappedBy = "vehicleCategory", fetch = FetchType.LAZY )
   private List<VEHICLE_SUBCATEGORY> vehicleSubCategories;
   

}
