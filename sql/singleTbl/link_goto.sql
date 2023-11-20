CREATE TABLE `t_link_goto` (
                                 `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                                 `full_short_url` varchar(128) DEFAULT NULL COMMENT '完整短链接',
                                 `gid` varchar(32) DEFAULT NULL COMMENT '分组标识',
                                 PRIMARY KEY (`id`),
                                 UNIQUE KEY `full_short_url` (`full_short_url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;