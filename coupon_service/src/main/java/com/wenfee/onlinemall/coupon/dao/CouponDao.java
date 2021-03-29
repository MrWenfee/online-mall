package com.wenfee.onlinemall.coupon.dao;

import com.wenfee.onlinemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 16:35:06
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
