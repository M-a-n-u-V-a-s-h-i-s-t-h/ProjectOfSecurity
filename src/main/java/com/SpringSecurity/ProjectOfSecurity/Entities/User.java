package com.SpringSecurity.ProjectOfSecurity.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "USERS_AUTHENTICATION_TBL")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;//ROLE_USER,ROLE_ADMIN
}