package com.github.Is0x4096.common.base.interf;

import jakarta.validation.constraints.NotNull;

import javax.annotation.Nullable;

/**
 * 枚举基础接口
 * 之所以用 string,是希望能兼容所有系统定义的状态码
 *
 * @author 0x4096.peng@gmail.com
 * @date 2021/7/24
 */
public interface IEnum<T> {

    /**
     * 获取 code
     *
     * @return code
     * @apiNote 根据规范 你不应该返回一个 null 值
     */
    @NotNull
    String getCode();

    /**
     * 获取 message
     *
     * @return message
     * @apiNote 根据规范 你不应该返回一个 null 值
     */
    @NotNull
    String getMessage();

    /**
     * 获取解决方案
     *
     * @return 解决方案
     * @apiNote 可能为 null 若是问题枚举, 根据规范你应该写上解决方案
     */
    @Nullable
    default String getSolution() {
        return null;
    }

    /**
     * 根据 code 转换对应的枚举
     *
     * @param code code
     * @return T
     * @apiNote 可能为 null
     */
    @Nullable
    T parseByCode(String code);

}
