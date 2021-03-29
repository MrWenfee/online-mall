package com.wenfee.onlinemall.order.dao;

import com.wenfee.onlinemall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:29:05
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
