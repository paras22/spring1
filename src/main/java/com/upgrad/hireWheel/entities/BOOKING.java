package com.upgrad.hireWheel.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Booking")


public class BOOKING {
   @Id
   @GeneratedValue
   private int bookingId;

   @Column( nullable = false)
   private Date pickUpDate;

   @Column( nullable = false)
   private Date dropOffDate;

   public int getBookingId() {
      return bookingId;
   }

   public void setBookingId(int bookingId) {
      this.bookingId = bookingId;
   }

   public Date getPickUpDate() {
      return pickUpDate;
   }

   public void setPickUpDate(Date pickUpDate) {
      this.pickUpDate = pickUpDate;
   }

   public Date getDropOffDate() {
      return dropOffDate;
   }

   public void setDropOffDate(Date dropOffDate) {
      this.dropOffDate = dropOffDate;
   }

   public Date getBookingDate() {
      return bookingDate;
   }

   public void setBookingDate(Date bookingDate) {
      this.bookingDate = bookingDate;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   public VEHICLE getVehicle() {
      return vehicle;
   }

   public void setVehicle(VEHICLE vehicle) {
      this.vehicle = vehicle;
   }

   public LOCATION getLocation() {
      return location;
   }

   public void setLocation(LOCATION location) {
      this.location = location;
   }

   @Column( nullable = false)
   private Date bookingDate;

   @Column(precision=10, scale=2,nullable = false)
   private int amount;



   @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
   @JoinColumn(name = "vehicleId")
   private VEHICLE vehicle;

   @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
   @JoinColumn(name = "locationId")
   private LOCATION location;

}