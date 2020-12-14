-- 删除表
DROP TABLE IF EXISTS `user`;
-- 创建表
CREATE TABLE `user`
(
    `id`         BIGINT UNSIGNED AUTO_INCREMENT         NOT NULL COMMENT '主键',
    `username`   VARCHAR(64)  DEFAULT ''                NOT NULL COMMENT '用户名',
    `password`   VARCHAR(128) DEFAULT ''                NOT NULL COMMENT '密码',
    `updated_at` TIMESTAMP    DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `created_at` TIMESTAMP    DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`),
    CONSTRAINT `uk_username` UNIQUE (`username`),
    INDEX `idx_updated_at` (`updated_at`),
    INDEX `idx_created_at` (`created_at`)
) ENGINE = InnoDB
  DEFAULT CHARSET = `utf8mb4`
  COLLATE = `utf8mb4_unicode_ci` COMMENT ='用户表';