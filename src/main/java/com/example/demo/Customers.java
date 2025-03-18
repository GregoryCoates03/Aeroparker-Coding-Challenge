package com.example.demo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Customers {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO-INCREMENT
  private Integer id;
  
  private LocalDate registered;

  @Column(name = "email_address")
  private String emailAddress;

  private String title;

  private String first_name;

  private String last_name;

  private String address_line_1;

  private String address_line_2;

  private String city;

  private String postcode;

  private String phone_number;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getRegistered() {
    return registered;
  }

  public void setRegistered(LocalDate registered) {
    this.registered = registered;
  }

  public String getEmail_Address() {
    return emailAddress;
  }

  public void setEmail_Address(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFirst_Name() {
    return first_name;
  }

  public void setFirst_Name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_Name() {
    return last_name;
  }

  public void setLast_Name(String last_name) {
    this.last_name = last_name;
  }

  public String getAddress_Line_1() {
    return address_line_1;
  }

  public void setAddress_Line_1(String address_line_1) {
    this.address_line_1 = address_line_1;
  }

  public String getAddress_Line_2() {
    return address_line_2;
  }

  public void setAddress_Line_2(String address_line_2) {
    this.address_line_2 = address_line_2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getPhone_Number() {
    return phone_number;
  }

  public void setPhone_Number(String phone_number) {
    this.phone_number = phone_number;
  }
}