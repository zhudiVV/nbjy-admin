package com.nbjy.nbjyadmin.dto;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class UsersDto {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private Boolean sex;
    @Column
    private Integer age;
}
