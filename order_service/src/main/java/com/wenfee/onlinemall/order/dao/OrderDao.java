package com.wenfee.onlinemall.order.dao;

import com.wenfee.onlinemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:29:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
