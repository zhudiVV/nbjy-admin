package com.nbjy.nbjyadmin.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@Data
public class AdminDto {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
}
