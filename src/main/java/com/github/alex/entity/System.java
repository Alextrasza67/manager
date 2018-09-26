package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "system")
@Getter
@Setter
public class System {

    @Id
    @Column(name = "sys_id")
    private String sysId;

    @Basic
    @Column(name = "sys_name")
    private String sysName;


}
