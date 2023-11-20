CREATE TABLE `t_link_goto` (
                               `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                               `short_uri` varchar(8) DEFAULT NULL,
                               `gid` varchar(32) DEFAULT NULL,
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;