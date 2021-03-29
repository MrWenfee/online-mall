package com.wenfee.onlinemall.coupon.dao;

import com.wenfee.onlinemall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 16:35:06
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
