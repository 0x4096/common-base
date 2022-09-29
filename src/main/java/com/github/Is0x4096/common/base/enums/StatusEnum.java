package com.github.Is0x4096.common.base.enums;

import com.github.Is0x4096.common.base.interf.IEnum;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

import javax.annotation.Nullable;

/**
 * 状态枚举
 *
 * @author 0x4096.peng@gmail.com
 * @date 2021/3/13
 */
@AllArgsConstructor
public enum StatusEnum implements IEnum<StatusEnum> {

    FAILURE("0", "失败"),
    SUCCESS("200", "成功"),
    MOVED_PERMANENTLY("301", "重定向"),
    NOT_MODIFIED("304", "未修改"),
    NOT_MODIFIED_SAVE("309", "已存在"),
    BAD_REQUEST("400", "请求语法错误"),
    UNAUTHORIZED("401", "无权访问"),
    FORBIDDEN("403", "拒绝服务"),
    NOT_FOUND("404", "操作资源不存在"),
    REQUEST_TIMEOUT("408", "请求超时"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误"),
    BAD_GATEWAY("502", "网关无响应"),
    SERVICE_UNAVAILABLE("503", "服务器端临时错误"),
    GATEWAY_TIMEOUT("504", "网关超时"),

    ;

    @NotNull
    private final String code;

    @NotNull
    private final String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Nullable
    @Override
    public StatusEnum parseByCode(String code) {
        for (StatusEnum statusEnum : values()) {
            if (statusEnum.code.equals(code)) {
                return statusEnum;
            }
        }

        return null;
    }

}
