package org.linzzxz.shortlink.project.test;

public class LinkGotoTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_link_goto_%d` (\n" +
            "                                 `id` bigint unsigned NOT NULL AUTO_INCREMENT,\n" +
            "                                 `full_short_url` varchar(128) DEFAULT NULL COMMENT '完整短链接',\n" +
            "                                 `gid` varchar(32) DEFAULT NULL COMMENT '分组标识',\n" +
            "                                 PRIMARY KEY (`id`),\n" +
            "                                 UNIQUE KEY `full_short_url` (`full_short_url`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
