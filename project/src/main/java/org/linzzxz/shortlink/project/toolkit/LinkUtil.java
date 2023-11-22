package org.linzzxz.shortlink.project.toolkit;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.Optional;

import static org.linzzxz.shortlink.project.common.constant.ShortLinkConstant.DEFAULT_CACHE_VALID_TIME;

/**
 * 短链接工具类
 */
public class LinkUtil {

    /**
     * 获取短链接缓存有效时间（毫秒）
     *
     * @param validDate 有效期时间戳
     * @return 有效时间
     */
    public static long getLinkCacheValidDate(Date validDate) {
        return Optional.ofNullable(validDate)
                .map(each -> DateUtil.between(new Date(), each, DateUnit.MS))
                .orElse(DEFAULT_CACHE_VALID_TIME);
    }

    /**
     * 获取用户真实IP
     *
     * @param request 请求
     * @return 真实IP
     */
    public static String getActualIP(HttpServletRequest request) {
        String actualIP = request.getHeader("X-Forwarded-For");
        if (actualIP == null || actualIP.isEmpty() || "unknown".equalsIgnoreCase(actualIP)) {
            actualIP = request.getHeader("X-Real-IP");
        }
        if (actualIP == null || actualIP.isEmpty() || "unknown".equalsIgnoreCase(actualIP)) {
            actualIP = request.getRemoteAddr();
        }
        return actualIP;
    }
}