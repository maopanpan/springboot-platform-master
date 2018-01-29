/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : myself

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-26 17:23:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_code` varchar(100) NOT NULL COMMENT '菜单编号',
  `parent_menu_id` int(11) NOT NULL DEFAULT '0' COMMENT '父菜单ID',
  `menu_name` varchar(50) NOT NULL COMMENT '菜单名称',
  `menu_remark` varchar(200) NOT NULL COMMENT '菜单描述',
  `menu_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '菜单状态（0：可用，1：不可用）',
  `menu_uri` varchar(200) NOT NULL COMMENT '菜单地址',
  `icon_css` varchar(50) DEFAULT NULL COMMENT '图标样式',
  `sequence` int(11) NOT NULL COMMENT '序列',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', 'M0010', '0', '系统管理', '系统管理子菜单', '0', '#', 'demo-pli-gear', '1', '2017-12-09 10:57:10', '1', '2017-12-09 10:57:10', null);
INSERT INTO `sys_menu` VALUES ('2', 'M001001', '1', '系统管理', '系统管理子菜单', '0', '/org/fetchOrgInfo', '', '1', '2017-12-12 11:27:11', '1', '2017-12-12 11:27:11', null);
INSERT INTO `sys_menu` VALUES ('3', 'M001002', '1', '用户管理', '系统管理子菜单', '0', '/user/fetchSysUserPage', '', '1', '2017-12-15 11:12:38', '1', '2017-12-15 11:12:38', null);
INSERT INTO `sys_menu` VALUES ('4', 'M001003', '1', '角色管理', '系统管理子菜单', '0', '/role/fetchSysRolePage', '', '1', '2017-12-15 14:57:52', '1', '2017-12-15 14:57:52', null);
INSERT INTO `sys_menu` VALUES ('5', 'M001004', '1', '菜单管理', '系统管理子菜单', '0', '/menu/fetchSysMenuPage', '', '1', '2017-12-15 16:42:03', '1', '2017-12-15 16:42:03', null);
INSERT INTO `sys_menu` VALUES ('6', 'M001006', '1', '操作管理', '系统管理子菜单', '0', '/operate/fetchOperateAllPage', '', '1', '2017-12-15 17:37:53', '1', '2017-12-15 17:37:53', null);

-- ----------------------------
-- Table structure for `sys_operate`
-- ----------------------------
DROP TABLE IF EXISTS `sys_operate`;
CREATE TABLE `sys_operate` (
  `operate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '操作ID',
  `menu_id` int(11) NOT NULL COMMENT '所属菜单ID',
  `operate_name` varchar(100) NOT NULL COMMENT '操作名称',
  `operate_uri` varchar(100) NOT NULL COMMENT '操作地址',
  `operate_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '操作状态（0：可用，1：不可用）',
  `sequence` int(11) NOT NULL COMMENT '序列',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人ID',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`operate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_operate
-- ----------------------------
INSERT INTO `sys_operate` VALUES ('1', '2', '查询', '#', '0', '1', '2017-12-08 14:59:04', '1', null, null);
INSERT INTO `sys_operate` VALUES ('2', '2', '添加', '#', '0', '1', '2017-12-08 14:59:35', '1', null, null);
INSERT INTO `sys_operate` VALUES ('3', '2', '修改', '#', '0', '1', '2017-12-08 14:59:51', '1', null, null);
INSERT INTO `sys_operate` VALUES ('4', '2', '删除', '#', '0', '1', '2017-12-08 15:00:09', '1', null, null);
INSERT INTO `sys_operate` VALUES ('5', '3', '查询', '#', '0', '1', '2017-12-08 15:01:45', '1', null, null);
INSERT INTO `sys_operate` VALUES ('6', '3', '添加', '#', '0', '1', '2017-12-08 15:01:56', '1', null, null);
INSERT INTO `sys_operate` VALUES ('7', '3', '修改', '#', '0', '1', '2017-12-08 15:02:11', '1', null, null);
INSERT INTO `sys_operate` VALUES ('8', '3', '删除', '#', '0', '1', '2017-12-08 15:02:25', '1', null, null);
INSERT INTO `sys_operate` VALUES ('9', '4', '查询', '#', '0', '1', '2017-12-08 15:02:59', '1', null, null);
INSERT INTO `sys_operate` VALUES ('10', '4', '添加', '#', '0', '1', '2017-12-08 15:03:12', '1', null, null);
INSERT INTO `sys_operate` VALUES ('11', '4', '修改', '#', '0', '1', '2017-12-08 15:03:26', '1', null, null);
INSERT INTO `sys_operate` VALUES ('12', '4', '删除', '#', '0', '1', '2017-12-08 15:03:45', '1', null, null);
INSERT INTO `sys_operate` VALUES ('13', '5', '查询', '#', '0', '1', '2017-12-08 15:03:56', '1', null, null);
INSERT INTO `sys_operate` VALUES ('14', '5', '添加', '#', '0', '1', '2017-12-08 15:04:14', '1', null, null);
INSERT INTO `sys_operate` VALUES ('15', '5', '修改', '#', '0', '1', '2017-12-08 15:04:27', '1', null, null);
INSERT INTO `sys_operate` VALUES ('16', '5', '删除', '#', '0', '1', '2017-12-08 15:04:41', '1', null, null);
INSERT INTO `sys_operate` VALUES ('17', '6', '查询', '#', '0', '1', '2017-12-08 15:04:55', '1', null, null);
INSERT INTO `sys_operate` VALUES ('18', '6', '添加', '#', '0', '1', '2017-12-08 15:05:11', '1', null, null);
INSERT INTO `sys_operate` VALUES ('19', '6', '修改', '#', '0', '1', '2017-12-08 15:05:24', '1', null, null);
INSERT INTO `sys_operate` VALUES ('20', '6', '删除', '#', '0', '1', '2017-12-15 17:17:08', '1', '2017-12-15 17:17:08', null);

-- ----------------------------
-- Table structure for `sys_org`
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `org_id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_org_id` int(11) NOT NULL COMMENT '上级组织ID',
  `org_name` varchar(100) NOT NULL COMMENT '组织名称',
  `org_remark` varchar(200) NOT NULL COMMENT '组织说明',
  `org_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '组织状态（0：可用，1：不可用）',
  `del_flag` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除标识（0：未删除；1已删除）',
  `sequence` int(11) NOT NULL COMMENT '序列号',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人ID',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_org
-- ----------------------------
INSERT INTO `sys_org` VALUES ('1', '0', '集团总部', '集团总部', '0', '0', '1', '2017-12-14 17:26:34', '1', '2017-12-14 17:26:34', '1');
INSERT INTO `sys_org` VALUES ('25', '1', '市场部', '市场部', '0', '0', '1', '2017-12-14 17:38:54', '1', null, null);
INSERT INTO `sys_org` VALUES ('26', '1', '技术部', '技术部', '0', '0', '1', '2017-12-14 18:05:43', '1', null, null);

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) NOT NULL,
  `role_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '角色状态（0:可用，1：不可用）',
  `role_remark` varchar(200) NOT NULL,
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'admin', '0', '系统管理员', '2017-12-08 14:51:59', '1', null, null);

-- ----------------------------
-- Table structure for `sys_role_to_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_to_menu`;
CREATE TABLE `sys_role_to_menu` (
  `role_to_menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色与菜单关联表ID',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `menu_id` int(11) NOT NULL COMMENT '菜单ID',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`role_to_menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_to_menu
-- ----------------------------
INSERT INTO `sys_role_to_menu` VALUES ('1', '1', '1', '2017-12-08 15:06:58', '1', null, null);
INSERT INTO `sys_role_to_menu` VALUES ('2', '1', '2', '2017-12-08 15:07:14', '1', null, null);
INSERT INTO `sys_role_to_menu` VALUES ('3', '1', '3', '2017-12-08 15:07:25', '1', null, null);
INSERT INTO `sys_role_to_menu` VALUES ('4', '1', '4', '2017-12-08 15:07:31', '1', null, null);
INSERT INTO `sys_role_to_menu` VALUES ('5', '1', '5', '2017-12-08 15:07:38', '1', null, null);
INSERT INTO `sys_role_to_menu` VALUES ('6', '1', '6', '2017-12-08 15:07:45', '1', null, null);

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `org_id` int(11) NOT NULL COMMENT '系统ID',
  `user_code` varchar(100) NOT NULL COMMENT '用户编号',
  `user_name` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(200) NOT NULL COMMENT '密码',
  `user_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '用户状态（0：可用，1：不可用）',
  `full_name` varchar(50) NOT NULL COMMENT '真实姓名',
  `email` varchar(100) NOT NULL COMMENT '用户邮箱',
  `mobile` varchar(20) NOT NULL COMMENT '用户手机号',
  `icon` varchar(100) NOT NULL DEFAULT 'sys/img/profile-photos/1.png' COMMENT '用户图标',
  `sequence` int(11) NOT NULL COMMENT '序列',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人ID',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '1', 'u0010', 'admin', '21232f297a57a5a743894a0e4a801fc3', '0', '管理员', '799403142@qq.com', '15011479990', 'sys/img/profile-photos/1.png', '1', '2017-12-09 11:13:41', '1', '2017-12-09 11:13:41', null);

-- ----------------------------
-- Table structure for `sys_user_to_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_to_menu`;
CREATE TABLE `sys_user_to_menu` (
  `user_to_menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户菜单关键ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `menu_id` int(11) NOT NULL COMMENT '菜单ID',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`user_to_menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_to_menu
-- ----------------------------
INSERT INTO `sys_user_to_menu` VALUES ('1', '1', '1', '2017-12-08 15:08:24', '1', null, null);
INSERT INTO `sys_user_to_menu` VALUES ('2', '1', '2', '2017-12-08 15:08:30', '1', null, null);
INSERT INTO `sys_user_to_menu` VALUES ('3', '1', '3', '2017-12-08 15:08:39', '1', null, null);
INSERT INTO `sys_user_to_menu` VALUES ('4', '1', '4', '2017-12-08 15:08:45', '1', null, null);
INSERT INTO `sys_user_to_menu` VALUES ('5', '1', '5', '2017-12-08 15:08:50', '1', null, null);
INSERT INTO `sys_user_to_menu` VALUES ('6', '1', '6', '2017-12-08 15:08:57', '1', null, null);

-- ----------------------------
-- Table structure for `sys_user_to_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_to_role`;
CREATE TABLE `sys_user_to_role` (
  `user_to_role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色关联表ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_person` int(11) NOT NULL COMMENT '创建人',
  `update_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_person` int(11) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`user_to_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_to_role
-- ----------------------------
INSERT INTO `sys_user_to_role` VALUES ('1', '1', '1', '2017-12-08 15:05:58', '1', null, null);

-- ----------------------------
-- Table structure for `tcc_transaction_asset`
-- ----------------------------
DROP TABLE IF EXISTS `tcc_transaction_asset`;
CREATE TABLE `tcc_transaction_asset` (
  `TRANSACTION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DOMAIN` varchar(100) DEFAULT NULL,
  `GLOBAL_TX_ID` varbinary(32) NOT NULL,
  `BRANCH_QUALIFIER` varbinary(32) NOT NULL,
  `CONTENT` varbinary(8000) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  `TRANSACTION_TYPE` int(11) DEFAULT NULL,
  `RETRIED_COUNT` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `LAST_UPDATE_TIME` datetime DEFAULT NULL,
  `VERSION` int(11) DEFAULT NULL,
  PRIMARY KEY (`TRANSACTION_ID`),
  UNIQUE KEY `UX_TX_BQ` (`GLOBAL_TX_ID`,`BRANCH_QUALIFIER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tcc_transaction_asset
-- ----------------------------
