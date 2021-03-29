package com.wenfee.onlinemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 16:35:06
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

