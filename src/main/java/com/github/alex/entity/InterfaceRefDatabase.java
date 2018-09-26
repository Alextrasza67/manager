package com.github.alex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "interface_ref_database")
@Getter
@Setter
public class InterfaceRefDatabase {

    @Id
    @Column(name = "id")
    private String id;

    @Basic
    @Column(name = "field_id")
    private String fieldId;

    @Basic
    @Column(name = "column_id")
    private String columnId;

}
