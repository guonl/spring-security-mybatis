
-- -----------------------------------------------------
-- Schema spring_security
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `spring_security` ;

-- -----------------------------------------------------
-- Schema spring_security
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `spring_security` DEFAULT CHARACTER SET utf8 ;
USE `spring_security` ;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_PERSONAL');
INSERT INTO `role` VALUES ('2', 'ROLE_BOSS');
INSERT INTO `role` VALUES ('3', 'ROLE_MANAGER');
INSERT INTO `role` VALUES ('4', 'ROLE_EMPLOYEE');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `isEnabled` tinyint(4) unsigned DEFAULT '1' COMMENT '0:不可用 1:可用',
  `type` tinyint(4) DEFAULT '1' COMMENT '1:个人用户，以手机为登录凭证 2:企业用户，以邮箱为登录凭证',
  `creatAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'boss', 'boss@gmail.com', '123123123', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', '1', '2', '2018-02-06 00:00:00');
INSERT INTO `user` VALUES ('2', 'manager', 'manager@gmail.com', '123123123', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', '1', '2', '2018-02-06 00:00:00');
INSERT INTO `user` VALUES ('3', 'employee', 'employee@gmail.com', '123123123', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', '1', '2', '2018-02-06 00:00:00');
INSERT INTO `user` VALUES ('4', 'disemployee', 'disemployee@gmail.com', '123123123', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', '0', '2', '2018-02-06 00:00:00');
INSERT INTO `user` VALUES ('5', 'personal', 'personal@gmail.com', '123123123', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', '1', '1', '2018-02-06 00:00:00');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) unsigned DEFAULT NULL,
  `roleId` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '1', '2');
INSERT INTO `user_role` VALUES ('3', '1', '3');
INSERT INTO `user_role` VALUES ('4', '1', '4');
INSERT INTO `user_role` VALUES ('5', '2', '3');
INSERT INTO `user_role` VALUES ('6', '2', '4');
INSERT INTO `user_role` VALUES ('7', '2', '1');
INSERT INTO `user_role` VALUES ('8', '3', '1');
INSERT INTO `user_role` VALUES ('9', '3', '4');
INSERT INTO `user_role` VALUES ('10', '4', '1');
INSERT INTO `user_role` VALUES ('11', '4', '4');
INSERT INTO `user_role` VALUES ('12', '5', '1');
