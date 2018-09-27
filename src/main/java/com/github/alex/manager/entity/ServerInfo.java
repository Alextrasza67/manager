package com.github.alex.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by alex on 2018/9/26.
 */
@Entity
@Table(name = "server_info")
@Getter
@Setter
public class ServerInfo {
    @Id
    @Column(name = "server_id")
    private String serverId;

    @Basic
    @Column(name = "server_name")
    private String serverName;

    @Basic
    @Column(name = "server_host")
    private String serverHost;

    @Basic
    @Column(name = "server_ip")
    private String serverIp;

    @Basic
    @Column(name = "server_os")
    private String serverOs;


}
