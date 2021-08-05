package com.github.Is0x4096.common.base.pojo.vo;

import com.github.Is0x4096.common.base.extend.ToString;
import lombok.Getter;
import lombok.Setter;

/**
 * 基础分页请求VO
 *
 * @author 0x4096.peng@gmail.com
 * @date 2021/7/24
 */
@Setter
@Getter
public class ReqPageVO extends ToString {

    /**
     * 当前页
     */
    private int pageNum = 1;

    /**
     * 当前页数据量
     */
    private int pageSize = 10;

}
