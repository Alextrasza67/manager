package com.github.alex.entity;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "sys_constants")
public class SysConstants {

    @Id
    @Column(name = "cons_id")
    private String consId;

    @Basic
    @Column(name = "sys_id")
    private String sysId;

    @Basic
    @Column(name = "code")
    private String code;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "parent_id")
    private String parentId;

    @Basic
    @Column(name = "del_flag")
    private String delFlag;

    @Basic
    @Column(name = "order_num")
    private Integer orderNum;

}
