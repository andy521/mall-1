package com.scoprion.mall.wx.mapper;

import com.scoprion.mall.domain.OrderLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author by Administrator
 * @created on 2017/11/6/006.
 */

@Mapper
public interface WxOrderLogMapper {


    /**
     * 创建订单日志
     *
     * @param orderLog
     * @return
     */
    int add(OrderLog orderLog);

}
