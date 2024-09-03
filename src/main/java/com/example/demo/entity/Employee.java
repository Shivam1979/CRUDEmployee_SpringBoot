package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.validation.constraints.Email;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;

//    @NotNull(message = "Name should Not be Null")
    @NotNull
    private String name;

//    @Email(message="Please provide a valid email address")
    private String emailId;

//    @Pattern(regexp="(^$|[0-9]{10})")
    private String mobNo;
    private String address;
}
