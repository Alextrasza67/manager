package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "sys_config")
@Getter
@Setter
public class SysConfig {

    @Id
    @Column(name = "config_id")
    private String configId;

    @Basic
    @Column(name = "sys_id")
    private String sysId;

    @Basic
    @Column(name = "config_class")
    private String configClass;

    @Basic
    @Column(name = "config_json")
    private String configJson;

}
