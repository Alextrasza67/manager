package com.github.alex.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "server_port")
@Getter
@Setter
public class ServerPort {

    @Id
    @Column(name = "port_id")
    private String portId;

    @Basic
    @Column(name = "server_id")
    private String serverId;

    @Basic
    @Column(name = "service_name")
    private String serviceName;

}
