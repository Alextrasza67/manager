package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "interface_field")
@Getter
@Setter
public class InterfaceField {


    @Id
    @Column(name = "field_id")
    private String fieldId;

    @Basic
    @Column(name = "para_id")
    private String paraId;

    @Basic
    @Column(name = "field_code")
    private String fieldCode;

    @Basic
    @Column(name = "field_name")
    private String fieldName;

    @Basic
    @Column(name = "data_type")
    private String dataType;

    @Basic
    @Column(name = "data_length")
    private Integer dataLength;

    @Basic
    @Column(name = "numeric_scale")
    private Integer numericScale;

    @Basic
    @Column(name = "field_type")
    private String fieldType;

    @Basic
    @Column(name = "fidle_type_ref_para")
    private String fidleTypeRefPara;

    @Basic
    @Column(name = "nullable")
    private Integer nullable;

    @Basic
    @Column(name = "default_value")
    private String defaultValue;

    @Basic
    @Column(name = "field_comment")
    private String fieldComment;

    @Basic
    @Column(name = "cons_id")
    private String consId;

    @Basic
    @Column(name = "order_num")
    private Integer orderNum;

}
