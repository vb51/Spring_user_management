package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
@Data
@Entity
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

