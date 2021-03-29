package com.wenfee.onlinemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:29:05
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

