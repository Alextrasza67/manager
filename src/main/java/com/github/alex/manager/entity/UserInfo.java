package com.github.alex.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "tb_user")
@Getter
@Setter
public class UserInfo {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Basic
    @Column(name = "log_name")
    private String logName;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "del_flag")
    private String delFlag;

}
