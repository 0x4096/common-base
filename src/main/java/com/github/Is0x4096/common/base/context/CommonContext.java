package com.github.Is0x4096.common.base.context;

/**
 * 线程上线文, 用于 com.github.Is0x4096.common.base.result.ResultWrapper#traceId 数据获取
 * 在正确时机写入值,用完及时清理,比如使用 HttpFilter
 *
 *         CommonContext.threadLocal.set(UUID.randomUUID().toString());
 *         try {
 *             this.doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
 *         } finally {
 *             CommonContext.threadLocal.remove();
 *         }
 * @author 0x4096.peng@gmail.com
 * @date 2021/10/9
 */
public class CommonContext {

    public static final ThreadLocal<String> traceIdThreadLocal = new InheritableThreadLocal<>();

}
