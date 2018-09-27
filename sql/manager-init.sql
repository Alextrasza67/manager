/*
 Navicat Premium Data Transfer

 Source Server         : mysql@localhost
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : manager

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 27/09/2018 21:15:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for db_column
-- ----------------------------
DROP TABLE IF EXISTS `db_column`;
CREATE TABLE `db_column` (
  `column_id` varchar(32) NOT NULL,
  `table_id` varchar(32) DEFAULT NULL,
  `column_code` varchar(32) DEFAULT NULL,
  `column_name` varchar(32) DEFAULT NULL,
  `data_type` varchar(16) DEFAULT NULL,
  `data_length` int(11) DEFAULT NULL,
  `numeric_scale` int(11) DEFAULT NULL,
  `column_type` varchar(32) DEFAULT NULL,
  `nullable` int(11) DEFAULT NULL,
  `default_value` varchar(64) DEFAULT NULL,
  `column_comment` varchar(256) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`column_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for db_database
-- ----------------------------
DROP TABLE IF EXISTS `db_database`;
CREATE TABLE `db_database` (
  `db_id` varchar(32) NOT NULL,
  `port_id` varchar(32) DEFAULT NULL,
  `db_name` varchar(64) DEFAULT NULL,
  `db_type` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`db_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for db_schema
-- ----------------------------
DROP TABLE IF EXISTS `db_schema`;
CREATE TABLE `db_schema` (
  `schema_id` varchar(32) NOT NULL,
  `db_id` varchar(32) DEFAULT NULL,
  `schema_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`schema_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for db_table
-- ----------------------------
DROP TABLE IF EXISTS `db_table`;
CREATE TABLE `db_table` (
  `table_id` varchar(32) NOT NULL,
  `schema_id` varchar(32) DEFAULT NULL,
  `table_name` varchar(64) DEFAULT NULL,
  `table_comment` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`table_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for interface_field
-- ----------------------------
DROP TABLE IF EXISTS `interface_field`;
CREATE TABLE `interface_field` (
  `field_id` varchar(32) NOT NULL,
  `para_id` varchar(32) DEFAULT NULL,
  `field_code` varchar(32) DEFAULT NULL,
  `field_name` varchar(64) DEFAULT NULL,
  `data_type` varchar(16) DEFAULT NULL,
  `data_length` int(11) DEFAULT NULL,
  `numeric_scale` int(11) DEFAULT NULL,
  `field_type` varchar(32) DEFAULT NULL,
  `fidle_type_ref_para` varchar(32) DEFAULT NULL,
  `nullable` int(11) DEFAULT NULL,
  `default_value` varchar(64) DEFAULT NULL,
  `field_comment` varchar(256) DEFAULT NULL,
  `cons_id` varchar(32) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`field_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for interface_info
-- ----------------------------
DROP TABLE IF EXISTS `interface_info`;
CREATE TABLE `interface_info` (
  `interface_id` varchar(32) NOT NULL,
  `sys_id` varchar(32) DEFAULT NULL,
  `interface_code` varchar(32) DEFAULT NULL,
  `interface_name` varchar(64) DEFAULT NULL,
  `interface_comment` varchar(256) DEFAULT NULL,
  `provider` varchar(32) DEFAULT NULL,
  `customer` varchar(32) DEFAULT NULL,
  `request_para_id` varchar(32) DEFAULT NULL,
  `reponse_para_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`interface_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for interface_parameter
-- ----------------------------
DROP TABLE IF EXISTS `interface_parameter`;
CREATE TABLE `interface_parameter` (
  `para_id` varchar(32) NOT NULL,
  `para_code` varchar(32) DEFAULT NULL,
  `para_name` varchar(64) DEFAULT NULL,
  `para_comment` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`para_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for interface_ref_database
-- ----------------------------
DROP TABLE IF EXISTS `interface_ref_database`;
CREATE TABLE `interface_ref_database` (
  `id` varchar(32) NOT NULL,
  `field_id` varchar(32) DEFAULT NULL,
  `column_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for server_account
-- ----------------------------
DROP TABLE IF EXISTS `server_account`;
CREATE TABLE `server_account` (
  `account_id` varchar(32) NOT NULL,
  `port_id` varchar(32) DEFAULT NULL,
  `log_name` varchar(64) DEFAULT NULL,
  `password` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for server_info
-- ----------------------------
DROP TABLE IF EXISTS `server_info`;
CREATE TABLE `server_info` (
  `server_id` varchar(32) NOT NULL,
  `server_name` varchar(64) DEFAULT NULL,
  `server_host` varchar(64) DEFAULT NULL,
  `server_ip` varchar(16) DEFAULT NULL,
  `server_os` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`server_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for server_port
-- ----------------------------
DROP TABLE IF EXISTS `server_port`;
CREATE TABLE `server_port` (
  `port_id` varchar(32) NOT NULL,
  `server_id` varchar(32) DEFAULT NULL,
  `service_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`port_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `config_id` varchar(32) NOT NULL,
  `sys_id` varchar(32) DEFAULT NULL,
  `config_class` varchar(256) DEFAULT NULL,
  `config_json` json DEFAULT NULL,
  PRIMARY KEY (`config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for sys_constants
-- ----------------------------
DROP TABLE IF EXISTS `sys_constants`;
CREATE TABLE `sys_constants` (
  `cons_id` varchar(32) NOT NULL,
  `sys_id` varchar(32) DEFAULT NULL,
  `code` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `parent_id` varchar(32) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`cons_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for sys_info
-- ----------------------------
DROP TABLE IF EXISTS `sys_info`;
CREATE TABLE `sys_info` (
  `sys_id` varchar(32) NOT NULL,
  `sys_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`sys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(32) NOT NULL,
  `log_name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
