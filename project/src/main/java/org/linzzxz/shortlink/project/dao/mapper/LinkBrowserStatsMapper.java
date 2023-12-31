package org.linzzxz.shortlink.project.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.linzzxz.shortlink.project.dao.entity.LinkBrowserStatsDO;

/**
 * 浏览器统计访问持久层
 */
public interface LinkBrowserStatsMapper {

    /**
     * 记录浏览器访问监控数据
     */
    @Insert("INSERT INTO t_link_browser_stats (full_short_url, gid, date, cnt, browser, create_time, update_time, del_flag) " +
            "VALUES( #{linkBrowserStats.fullShortUrl}, #{linkBrowserStats.gid}, #{linkBrowserStats.date}, #{linkBrowserStats.cnt}, #{linkBrowserStats.browser}, NOW(), NOW(), 0) " +
            "ON DUPLICATE KEY UPDATE cnt = cnt +  #{linkBrowserStats.cnt};")
    void shortLinkBrowserStats(@Param("linkBrowserStats") LinkBrowserStatsDO linkBrowserStatsDO);
}
