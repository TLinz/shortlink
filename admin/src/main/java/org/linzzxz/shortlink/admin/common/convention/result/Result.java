package org.linzzxz.shortlink.admin.common.convention.result;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * 全局返回对象
 */
@Data
// 链式调用，生成的setter方法将返回当前对象的实例，而不是void
@Accessors(chain = true)
public class Result<T> implements Serializable {

    // 序列化版本控制，防止不同版本的类导致的兼容性问题
    @Serial
    private static final long serialVersionUID = 5679018624309023727L;

    /**
     * 正确返回码
     */
    public static final String SUCCESS_CODE = "0";

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 请求ID
     */
    private String requestId;

    // is开头，序列化为json字段
    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

}
