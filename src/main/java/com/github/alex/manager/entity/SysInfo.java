package com.github.alex.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "sys_info")
@Getter
@Setter
public class SysInfo {

    @Id
    @Column(name = "sys_id")
    private String sysId;

    @Basic
    @Column(name = "sys_name")
    private String sysName;


}
