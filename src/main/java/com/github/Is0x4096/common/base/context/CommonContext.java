package com.github.Is0x4096.common.base.context;

/**
 * 线程上线文, 用于 com.github.Is0x4096.common.base.result.ResultWrapper#traceId 数据获取
 *
 * @author 0x4096.peng@gmail.com
 * @date 2021/10/9
 */
public class CommonContext {

    public static final ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

}
