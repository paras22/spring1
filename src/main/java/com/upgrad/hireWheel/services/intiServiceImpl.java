package com.upgrad.hireWheel.services;

import com.upgrad.hireWheel.entities.*;
import com.upgrad.hireWheel.daos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class intiServiceImpl  implements  initService{

    @Autowired
BookingDAO bookingDAO;
    @Autowired
CityDAO cityDAO;
    @Autowired
FuelTypeDAO fuelTypeDAO;
    @Autowired
LocationDAO locationDAO;
    @Autowired
RoleDAO roleDAO;
    @Autowired
usersDAO usersDAO;
    @Autowired
VehicleDAO vehicleDAO;
    @Autowired
VehicleSubcategoryDAO vehicleSubcategoryDAO;

    @Override
    public void startapp() {
        adduserType();
        adduserRole();
        addVehicleCategory();
        addVehicleSubCategory();
        addFuelType();
        addCity();
        addLocation();

    }

    private void addLocation() {
        LOCATION location1 = new LOCATION();
        location1.setLocationId(1);
        location1.setLocationName("Wroli");
        location1.setAddress("Dr E Moses Rd, Worli Naka, Upper Worli");
        location1.setPincode(400018);
        location1.setCity(cityDAO.findById(1).get());
        locationDAO.save(location1);
    }

    private void addCity() {
        CITY city = new CITY();
        city.setCityId(1);
        city.setCityName("Mumbai");
        cityDAO.save(city);

    }

    private void addFuelType() {
        FUEL_TYPE fuel_type1 = new FUEL_TYPE();
        FUEL_TYPE fuel_type2 = new FUEL_TYPE();

        List<FUEL_TYPE> fuel_typeList = new ArrayList<>();

        fuel_type1.setFuelTypeId(1);
        fuel_type1.setFuelType("Petrol");

        fuel_type2.setFuelTypeId(2);
        fuel_type2.setFuelType("Diesel");

    }

    private void addVehicleSubCategory() {

        VEHICLE_SUBCATEGORY vehicle_subcategory1 = new VEHICLE_SUBCATEGORY();
        VEHICLE_SUBCATEGORY vehicle_subcategory2 = new VEHICLE_SUBCATEGORY();
        VEHICLE_SUBCATEGORY vehicle_subcategory3 = new VEHICLE_SUBCATEGORY();
        VEHICLE_SUBCATEGORY vehicle_subcategory4 = new VEHICLE_SUBCATEGORY();
        VEHICLE_SUBCATEGORY vehicle_subcategory5 = new VEHICLE_SUBCATEGORY();
        VEHICLE_SUBCATEGORY vehicle_subcategory6 = new VEHICLE_SUBCATEGORY();
        List<VEHICLE_SUBCATEGORY> vehicle_subcategoryList = new ArrayList<>();



        vehicle_subcategory1.setVehicleSubCategoryId(1);
        vehicle_subcategory1.setVehicleSubCategoryName("SUV");
        vehicle_subcategory1.setPricePerHour(300);
        vehicle_subcategoryList.add(vehicle_subcategory1);

        vehicle_subcategory2.setVehicleSubCategoryId(2);
        vehicle_subcategory2.setVehicleSubCategoryName("SEDAN");
        vehicle_subcategory2.setPricePerHour(350);
        vehicle_subcategoryList.add(vehicle_subcategory2);


        vehicle_subcategory3.setVehicleSubCategoryId(3);
        vehicle_subcategory3.setVehicleSubCategoryName("HATCHBACK");
        vehicle_subcategory3.setPricePerHour(250);
        vehicle_subcategoryList.add(vehicle_subcategory3);


        vehicle_subcategory4.setVehicleSubCategoryId(4);
        vehicle_subcategory4.setVehicleSubCategoryName("CRUISER");
        vehicle_subcategory4.setPricePerHour(200);
        vehicle_subcategoryList.add(vehicle_subcategory4);


        vehicle_subcategory5.setVehicleSubCategoryId(5);
        vehicle_subcategory5.setVehicleSubCategoryName("DIRT BIKE");
        vehicle_subcategory5.setPricePerHour(200);
        vehicle_subcategoryList.add(vehicle_subcategory5);


        vehicle_subcategory6.setVehicleSubCategoryId(6);
        vehicle_subcategory6.setVehicleSubCategoryName("SPORTS BIKE");
        vehicle_subcategory6.setPricePerHour(150);
        vehicle_subcategoryList.add(vehicle_subcategory6);






    }

    private void addVehicleCategory() {
        VEHICLE_CATEGORY vehicle_category1 = new VEHICLE_CATEGORY();
        VEHICLE_CATEGORY vehicle_category2 = new VEHICLE_CATEGORY();

        List<VEHICLE_CATEGORY> vehicle_categoryList = new ArrayList<>();

        vehicle_category1.setVehicleCategoryId(10);
        vehicle_category1.setVehicleCategoryName("Car");
        vehicle_categoryList.add(vehicle_category1);


        vehicle_category2.setVehicleCategoryId(11);
        vehicle_category2.setVehicleCategoryName("Bike");
        vehicle_categoryList.add(vehicle_category2);



    }

    private void adduserRole() {
        ROLE role1 = new ROLE();
        ROLE role2 = new ROLE();

        role1.setRoleId(1);
        role1.setRoleName("ADMIN");
        role2.setRoleId(2);
        role2.setRoleName("USER");
    }

    private void adduserType() {
        Users users = new Users();
        users.setFirst_name("Admin1");
        users.setLast_name("Admin1");
        users.setMobile_no(199999999);
        users.setEmail("u1pgrad@gmail.com");
        users.setPassword("1admin@123");
        users.setRole_id(usersDAO.findByRoleId(1));
        users.setWallet_money(100000);
        usersDAO.saveUsers(users);


    }


}
