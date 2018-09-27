package com.github.alex.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "db_table")
@Getter
@Setter
public class DbTable {

    @Id
    @Column(name = "table_id")
    private String tableId;

    @Basic
    @Column(name = "schema_id")
    private String schemaId;

    @Basic
    @Column(name = "table_name")
    private String tableName;

    @Basic
    @Column(name = "table_comment")
    private String tableComment;

}
