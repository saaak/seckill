/*
 Navicat Premium Data Transfer

 Source Server         : ssm学习
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : 39.108.68.182:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 11/12/2019 22:36:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for seckill
-- ----------------------------
DROP TABLE IF EXISTS `seckill`;
CREATE TABLE `seckill`  (
  `seckill_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品库存ID',
  `name` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `number` int(11) NOT NULL COMMENT '库存数量',
  `start_time` timestamp(0) NOT NULL COMMENT '秒杀开始时间',
  `end_time` timestamp(0) NOT NULL COMMENT '秒杀结束时间',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`seckill_id`) USING BTREE,
  INDEX `idx_start_time`(`start_time`) USING BTREE,
  INDEX `idx_end_time`(`end_time`) USING BTREE,
  INDEX `idx_create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1004 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '秒杀库存表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of seckill
-- ----------------------------
INSERT INTO `seckill` VALUES (1000, '1000元秒杀iphoneXR', 89, '2019-12-11 19:00:00', '2019-12-12 00:00:00', '2019-12-10 20:08:46');
INSERT INTO `seckill` VALUES (1001, '500元秒杀iphone6', 200, '2019-12-12 00:00:00', '2019-12-13 00:00:00', '2019-12-10 20:08:46');
INSERT INTO `seckill` VALUES (1002, '1000元秒杀ipad', 300, '2019-11-01 00:00:00', '2019-11-02 00:00:00', '2019-12-10 20:08:46');
INSERT INTO `seckill` VALUES (1003, '200元秒杀iphoneXR', 400, '2019-11-01 00:00:00', '2019-11-02 00:00:00', '2019-12-10 20:08:46');

SET FOREIGN_KEY_CHECKS = 1;
