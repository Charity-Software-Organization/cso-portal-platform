/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : portal-platform

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 25/02/2021 10:53:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cso_cooperation_organization
-- ----------------------------
DROP TABLE IF EXISTS `cso_cooperation_organization`;
CREATE TABLE `cso_cooperation_organization`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `co_org_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合作机构名称',
  `co_org_profile_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合作机构简介',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cso_donation
-- ----------------------------
DROP TABLE IF EXISTS `cso_donation`;
CREATE TABLE `cso_donation`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `donation_org_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '捐赠机构名称',
  `donation_project_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '捐赠项目名称',
  `donation_price` int(11) NULL DEFAULT NULL COMMENT '捐赠数目',
  `donation_type` int(11) NULL DEFAULT NULL COMMENT '捐赠类型（1.线上 2.线下）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cso_member
-- ----------------------------
DROP TABLE IF EXISTS `cso_member`;
CREATE TABLE `cso_member`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `member_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员名称',
  `member_sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员性别',
  `member_birthday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员生日',
  `member_profile_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '成员个人简介',
  `member_photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员头像（地址）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cso_memorabilia
-- ----------------------------
DROP TABLE IF EXISTS `cso_memorabilia`;
CREATE TABLE `cso_memorabilia`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `memorabilia_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大事记标题',
  `memorabilia_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大事记详细信息',
  `memorabilia_date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大事记发生时间',
  `memorabilia_type` int(11) NULL DEFAULT NULL COMMENT '大事记类型（1.对内 2.对外）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cso_organization
-- ----------------------------
DROP TABLE IF EXISTS `cso_organization`;
CREATE TABLE `cso_organization`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `org_profile_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '组织简介',
  `org_createdate` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '组织创建日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
