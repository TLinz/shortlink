package org.linzzxz.shortlink.admin.test;

public class UserTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_user_%d` (\n" +
            "                          `id` bigint unsigned NOT NULL AUTO_INCREMENT,\n" +
            "                          `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',\n" +
            "                          `password` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',\n" +
            "                          `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',\n" +
            "                          `phone` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',\n" +
            "                          `mail` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',\n" +
            "                          `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',\n" +
            "                          `update_time` datetime DEFAULT NULL COMMENT '修改时间',\n" +
            "                          `create_time` datetime DEFAULT NULL COMMENT '创建时间',\n" +
            "                          `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',\n" +
            "                          PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
