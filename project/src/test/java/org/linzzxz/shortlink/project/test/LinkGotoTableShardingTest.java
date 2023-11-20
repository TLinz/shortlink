package org.linzzxz.shortlink.project.test;

public class LinkGotoTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_link_goto_%d` (\n" +
            "                               `id` bigint unsigned NOT NULL AUTO_INCREMENT,\n" +
            "                               `short_uri` varchar(8) DEFAULT NULL,\n" +
            "                               `gid` varchar(32) DEFAULT NULL,\n" +
            "                               PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
