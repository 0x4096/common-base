package com.github.Is0x4096.common.base.result;

import com.github.Is0x4096.common.base.context.CommonContext;
import com.github.Is0x4096.common.base.extend.ToString;
import com.github.Is0x4096.common.base.page.Pagination;
import lombok.*;
import lombok.experimental.Accessors;

import javax.annotation.Nullable;
import java.io.Serializable;

/**
 * 统一结果包装
 * ResultWrapper<String> resultWrapper = ResultWrapper.<String>builder()
 * .success(true)
 * .data("success")
 * .build();
 *
 * @author 0x4096.peng@gmail.com
 * @date 2021/3/5
 */
@Setter
@Getter
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ResultWrapper<T> extends ToString implements Serializable {

    private static final long serialVersionUID = 945314152507157220L;

    /**
     * 本业务系统状态码
     */
    @Builder.Default
    private int code = 200;

    /**
     * 本业务系统响应信息
     */
    @Nullable
    @Builder.Default
    private String message = "success";

    /**
     * 下游业务系统状态码
     */
    @Builder.Default
    private int subCode = 200;

    /**
     * 下游业务系统响应信息
     */
    @Nullable
    @Builder.Default
    private String subMessage = "success";

    /**
     * 链路追踪ID
     */
    @Nullable
    private String traceId = CommonContext.threadLocal.get();

    /**
     * 响应数据
     */
    @Nullable
    private T data;

    /**
     * 分页数据
     */
    @Nullable
    private Pagination page;

}
