package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "server_account")
@Setter
@Getter
public class ServerAccount {

    @Id
    @Column(name = "account_id")
    private String accountId;

    @Basic
    @Column(name = "port_id")
    private String portId;

    @Basic
    @Column(name = "log_name")
    private String logName;

    @Basic
    @Column(name = "password")
    private String password;

}
