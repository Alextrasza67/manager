package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "interface_info")
@Getter
@Setter
public class InterfaceInfo {


    @Id
    @Column(name = "interface_id")
    private String interfaceId;

    @Basic
    @Column(name = "sys_id")
    private String sysId;

    @Basic
    @Column(name = "interface_code")
    private String interfaceCode;

    @Basic
    @Column(name = "interface_name")
    private String interfaceName;

    @Basic
    @Column(name = "interface_comment")
    private String interfaceComment;

    @Basic
    @Column(name = "provider")
    private String provider;

    @Basic
    @Column(name = "customer")
    private String customer;

    @Basic
    @Column(name = "request_para_id")
    private String requestParaId;

    @Basic
    @Column(name = "reponse_para_id")
    private String reponseParaId;

}
