package com.example.otss.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = -4626053975311743414L;
    public interface UserInfo{};
    @Id
    @GeneratedValue
    @Column()
    @JsonView(UserInfo.class)
    private int id;
    @Column()
    @JsonView(UserInfo.class)
    private String username;
    @Column()
    @JsonView(UserInfo.class)
    private String password;
    @Column()
    @JsonView(UserInfo.class)
    private int sex;
    @Column()
    @JsonView(UserInfo.class)
    private String  phone;
    @Column()
    @JsonView(UserInfo.class)
    private String email;
}
