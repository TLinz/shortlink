package org.linzzxz.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.linzzxz.shortlink.project.common.database.BaseDO;

import java.util.Date;

/**
 * 短链接实体
 */
@Data
@TableName("t_link")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShortLinkDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * 短链接
     */
    private String shortUri;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 点击量
     */
    private Integer clickNum;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 网站图片链接
     */
    private String favicon;

    /**
     * 启用标识 0：未启用 1：已启用
     */
    private Integer enableStatus;

    /**
     * 创建类型 0：控制台 1：接口
     */
    private Integer createdType;

    /**
     * 有效期类型 0：永久有效 1：用户自定义
     */
    private Integer validDateType;

    /**
     * 有效期
     */
    private Date validDate;

    /**
     * 描述
     */
    private String description;
}
