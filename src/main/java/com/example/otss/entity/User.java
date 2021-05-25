package com.example.otss.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -4432169744500855951L;
    @Id
    @GeneratedValue
    @Column()
    private long userId;
    @Column()
    private String myid;
    @Column()
    private String account;
    @Column()
    private String name;
    @Column()
    private String organizeId;
    @Column()
    private String organizeName;
    @Column()
    private String dutyId;
    @Column()
    private String titleId;
    @Column()
    private String password;
    @Column()
    private String email;
    @Column()
    private String lang;
    @Column()
    private String theme;
    @Column()
    private String firstVisit;
    @Column()
    private String previousVisit;
    @Column()
    private String lastVisits;
    @Column()
    private String loginCount;
    @Column()
    private String isemployee;
    @Column()
    private String status;
    @Column()
    private String ip;
    @Column()
    private String description;
    @Column()
    private String questionId;
    @Column()
    private String answer;
    @Column()
    private String isonline;
    @Column()
    private String created;
    @Column()
    private String lastmod;
    @Column()
    private String creater;
    @Column()
    private String modifyer;
    @Column()
    private String tel;
    @Column()
    private String stuNo;
    @Column()
    private String qq;
    @Column()
    private String weixin;
    @Column()
    private String mealArithmeticId;
    @Column()
    private String arithmeticName;
    @Column()
    private String sex;
    @Column()
    private String poo;
    @Column()
    private String address;
    @Column()
    private int age;

}
