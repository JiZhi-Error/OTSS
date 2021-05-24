package com.example.otss.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {
  private static final long serialVersionUID = -4432169744500855951L;
  @Id
    @GeneratedValue
    @Column()
    @JsonView(Users.UsersInfo.class)
    private long userId;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String myid;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String account;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String name;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String organizeId;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String organizeName;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String dutyId;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String titleId;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String password;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String email;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String lang;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String theme;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String firstVisit;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String previousVisit;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String lastVisits;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String loginCount;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String isemployee;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String status;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String ip;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String description;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String questionId;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String answer;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String isonline;
    @Column()
    @JsonView(Users.UsersInfo.class)

    private String created;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String lastmod;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String creater;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String modifyer;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String tel;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String stuNo;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String qq;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String weixin;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String mealArithmeticId;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String arithmeticName;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String sex;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String poo;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private String address;
    @Column()
    @JsonView(Users.UsersInfo.class)
    private long age;

    public interface UsersInfo {
    }
}
