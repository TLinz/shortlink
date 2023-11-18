CREATE TABLE `t_user_0` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_1` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_2` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_3` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_4` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_5` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_6` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_7` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_8` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_9` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                            `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                            `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                            `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                            `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                            `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                            `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_10` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                             `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                             `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                             `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                             `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                             `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                             `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_11` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                             `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                             `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                             `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                             `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                             `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                             `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_12` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                             `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                             `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                             `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                             `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                             `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                             `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_13` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                             `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                             `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                             `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                             `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                             `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                             `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_14` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                             `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                             `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                             `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                             `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                             `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                             `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `t_user_15` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
                             `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
                             `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                             `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
                             `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
                             `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',
                             `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;