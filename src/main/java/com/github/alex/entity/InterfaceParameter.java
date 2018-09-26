package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "interface_parameter")
@Getter
@Setter
public class InterfaceParameter {

    @Id
    @Column(name = "para_id")
    private String paraId;

    @Basic
    @Column(name = "para_code")
    private String paraCode;

    @Basic
    @Column(name = "para_name")
    private String paraName;

    @Basic
    @Column(name = "para_comment")
    private String paraComment;

}
