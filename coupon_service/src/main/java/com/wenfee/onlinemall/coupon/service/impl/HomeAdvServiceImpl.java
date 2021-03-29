package com.wenfee.onlinemall.coupon.service.impl;

import com.wenfee.onlinemall.common.utils.PageUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.wenfee.onlinemall.common.utils.Query;

import com.wenfee.onlinemall.coupon.dao.HomeAdvDao;
import com.wenfee.onlinemall.coupon.entity.HomeAdvEntity;
import com.wenfee.onlinemall.coupon.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvEntity> page = this.page(
                new Query<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}