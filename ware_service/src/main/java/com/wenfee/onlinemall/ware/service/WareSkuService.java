package com.wenfee.onlinemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 17:37:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

