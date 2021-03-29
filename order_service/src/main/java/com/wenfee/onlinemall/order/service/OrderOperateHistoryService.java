package com.wenfee.onlinemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:29:05
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

