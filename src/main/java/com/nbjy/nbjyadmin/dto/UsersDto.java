package com.nbjy.nbjyadmin.dto;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
public class UsersDto {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Integer sex;
    @Column
    private String isPaused;
    @Column
    private String birthday;
    @Column
    private String isMerry;
    @Column
    private String height;
    @Column
    private String weight;
    @Column
    private String education;
    @Column
    private String school;
    @Column
    private String salary;
    @Column
    private String work;
    @Column
    private String car;
    @Column
    private String house;
    @Column
    private String work_place;
    @Column
    private String native_place;
    @Column
    private String family_members;
    @Column
    private String parents;
    @Column
    private String self_introduce;
    @Column
    private String preditTime;
    @Column
    private String demand;
    @Column
    private String tel;
}
