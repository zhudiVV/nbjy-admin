package com.nbjy.nbjyadmin.dto;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class AdminDto {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
}
