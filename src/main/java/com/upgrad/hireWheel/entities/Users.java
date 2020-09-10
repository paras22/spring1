package com.upgrad.hireWheel.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  user_id;
    @Column(unique = true , nullable =  false)
    private  String first_name;
    @Column( nullable =  false)
    private String last_name;
    @Column( unique = true ,nullable =  false)
    private String password;
    
    @Column( unique = true ,nullable =  false)
    private String email;
    @Column(unique = true , nullable =  false)
    private  int mobile_no;
    @Column(nullable =  false)
    private int role_id;
    @Column( unique = true ,nullable =  false)
    private  int wallet_money;


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(int wallet_money) {
        this.wallet_money = wallet_money;
    }

    public Users(){}

    public Users( String first_name , String last_name, String password, String email , int mobile_no, int role_id, int wallet_money) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.mobile_no = mobile_no;
        this.role_id = role_id;
        this.wallet_money = wallet_money;



   }


}
