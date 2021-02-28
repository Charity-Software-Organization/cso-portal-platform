/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : portal-platform

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 28/02/2021 14:54:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cso_cooperation_organization
-- ----------------------------
DROP TABLE IF EXISTS `cso_cooperation_organization`;
CREATE TABLE `cso_cooperation_organization`  (
  `id` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键id',
  `co_org_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合作机构名称',
  `co_org_profile_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合作机构简介',
  `del` int(1) NULL DEFAULT 0 COMMENT '0未删除 1删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cso_donation
-- ----------------------------
DROP TABLE IF EXISTS `cso_donation`;
CREATE TABLE `cso_donation`  (
  `id` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键id',
  `donation_picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '捐赠机构图标',
  `donation_org_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '捐赠机构名称',
  `donation_project_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '捐赠项目名称',
  `donation_price` int(11) NULL DEFAULT NULL COMMENT '捐赠数目',
  `donation_type` int(11) NULL DEFAULT NULL COMMENT '捐赠类型（1.线上 2.线下）',
  `del` int(1) NULL DEFAULT 0 COMMENT '0 未删除 1删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cso_donation
-- ----------------------------
INSERT INTO `cso_donation` VALUES ('21837ade96f1f0bd68dfd9feea0d2469', NULL, '130100', NULL, 1213, NULL, 0, '2021-02-28 14:36:02', '2021-02-28 14:36:02');
INSERT INTO `cso_donation` VALUES ('dfgdfg4545', NULL, '大力爱心机构', '拉拉手爱心项目11', 222321, 2, 0, NULL, NULL);
INSERT INTO `cso_donation` VALUES ('dsgfdgtrer2154', NULL, '爱心项目机构6', '拉拉手爱心项目6', 23423, 1, 0, NULL, NULL);
INSERT INTO `cso_donation` VALUES ('erhbfb', NULL, '爱心项目机构8', '拉拉手爱心项目8', 2548747, 1, 0, NULL, NULL);
INSERT INTO `cso_donation` VALUES ('erwret789', NULL, '爱心项目机构1', '拉拉手爱心项目2', 3000, 2, 0, '2021-02-10 11:57:48', NULL);
INSERT INTO `cso_donation` VALUES ('ewr45454w', NULL, '爱心项目机构', '拉拉手爱心项目', 15000, 1, 0, '2021-02-28 11:56:36', NULL);
INSERT INTO `cso_donation` VALUES ('gfdhfgh5484', NULL, '爱心项目机构4', '拉拉手爱心项目4', 78451, 2, 0, '2021-02-02 11:57:40', NULL);
INSERT INTO `cso_donation` VALUES ('gfhgjhc1115', NULL, '爱心项目机构5', '拉拉手爱心项目5', 4533, 1, 1, NULL, NULL);
INSERT INTO `cso_donation` VALUES ('gyrtgdxv4545', NULL, '爱心项目机构9', '拉拉手爱心项目9', 22211, 2, 0, NULL, NULL);
INSERT INTO `cso_donation` VALUES ('mhggh154', NULL, '爱心项目机构7', '拉拉手爱心项目7', 841851, 2, 0, NULL, NULL);
INSERT INTO `cso_donation` VALUES ('tguytu784', NULL, '爱心项目机构3', '拉拉手爱心项目3', 3541, 1, 0, '2021-02-11 11:57:44', NULL);

-- ----------------------------
-- Table structure for cso_member
-- ----------------------------
DROP TABLE IF EXISTS `cso_member`;
CREATE TABLE `cso_member`  (
  `id` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键id',
  `member_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员名称',
  `member_sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员性别',
  `member_birthday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员生日',
  `member_profile_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '成员个人简介',
  `member_photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '成员头像（地址）',
  `del` int(1) NULL DEFAULT 0 COMMENT '0删除 1未删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cso_memorabilia
-- ----------------------------
DROP TABLE IF EXISTS `cso_memorabilia`;
CREATE TABLE `cso_memorabilia`  (
  `id` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键id',
  `memorabilia_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大事记标题',
  `memorabilia_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大事记详细信息',
  `memorabilia_date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大事记发生时间',
  `memorabilia_type` int(11) NULL DEFAULT NULL COMMENT '大事记类型（1.对内 2.对外）',
  `del` int(1) NULL DEFAULT 0 COMMENT '0未删除 1删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cso_memorabilia
-- ----------------------------
INSERT INTO `cso_memorabilia` VALUES ('11', '大事件标题', '大事件信息', '2010-02-11', 1, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for cso_organization
-- ----------------------------
DROP TABLE IF EXISTS `cso_organization`;
CREATE TABLE `cso_organization`  (
  `id` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `org_profile_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '组织简介',
  `org_createdate` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '组织创建日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
