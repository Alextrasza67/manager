package com.github.alex.entity;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "db_schema")
public class DbSchema {
    private String schemaId;
    private String dbId;
    private String schemaName;

    @Id
    @Column(name = "schema_id")
    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    @Basic
    @Column(name = "db_id")
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "schema_name")
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

}
