package com.Vishwas.feature.user_management.entity;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserAccount{
	
    @Id
    @GeneratedValue
    private Integer userid;
    
    private String email;
    
    private String Fullname;
    private Long Phoneno;
    private Long ssn;
    private String Gender;
    private LocalDate dob;
    private  String activeSw = "Y";

    @CreationTimestamp
    private LocalDate createdDate;
    @UpdateTimestamp
    private LocalDate updatedDate;


   
}

