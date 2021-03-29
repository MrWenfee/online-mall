package com.wenfee.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.wenfee.onlinemall.common.utils.PageUtils;
import com.wenfee.onlinemall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Mr.Wenfee
 * @email mr_wenfee@163.com
 * @date 2021-03-15 12:42:07
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

